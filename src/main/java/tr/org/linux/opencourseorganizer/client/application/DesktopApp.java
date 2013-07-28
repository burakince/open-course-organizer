package tr.org.linux.opencourseorganizer.client.application;

import tr.org.linux.opencourseorganizer.client.place.HomePlace;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;

public class DesktopApp implements App {

	private static Place defaultPlace = new HomePlace("home");

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

		SimplePanel panel = new SimplePanel();
		parentView.add(panel);

		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(panel);

		PlaceHistoryHandler placeHistoryHandler = new PlaceHistoryHandler(placeHistoryMapper);
		placeHistoryHandler.register(placeController, eventBus, defaultPlace);
		placeHistoryHandler.handleCurrentHistory();
	}

}
