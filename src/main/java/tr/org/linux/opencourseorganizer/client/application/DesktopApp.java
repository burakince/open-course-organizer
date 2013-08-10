package tr.org.linux.opencourseorganizer.client.application;

import java.util.logging.Logger;

import tr.org.linux.opencourseorganizer.client.place.Home;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class DesktopApp implements App {

	private static final Logger log = Logger.getLogger(DesktopApp.class.getName());
	private final Place defaultPlace = new Home("home");

	private final EventBus eventBus;
	private final PlaceController placeController;
	private final ActivityMapper activityMapper;
	private final PlaceHistoryMapper placeHistoryMapper;

	@Inject
	public DesktopApp(final EventBus eventBus,
			final PlaceController placeController,
			final ActivityMapper activityMapper,
			final PlaceHistoryMapper placeHistoryMapper) {
		this.eventBus = eventBus;
		this.placeController = placeController;
		this.activityMapper = activityMapper;
		this.placeHistoryMapper = placeHistoryMapper;
	}

	@Override
	public void run(HasWidgets.ForIsWidget parentView) {

		GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void onUncaughtException(Throwable e) {
				while (e instanceof UmbrellaException) {
					e = ((UmbrellaException) e).getCauses().iterator().next();
				}

				String message = e.getMessage();
				if (message == null) {
					message = e.toString();
				}
				Window.alert("An unexpected error occurred: " + message);
			}
		});

		log.info("DesktopApp is running.");

		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
			
			@Override
			public void onPlaceChange(PlaceChangeEvent event) {
				placeController.goTo(event.getNewPlace());
			}
		});

		SimplePanel panel = new SimplePanel();

		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(panel);

		PlaceHistoryHandler placeHistoryHandler = new PlaceHistoryHandler(placeHistoryMapper);
		placeHistoryHandler.register(placeController, eventBus, defaultPlace);

		parentView.add(panel);

		placeHistoryHandler.handleCurrentHistory();
	}

}