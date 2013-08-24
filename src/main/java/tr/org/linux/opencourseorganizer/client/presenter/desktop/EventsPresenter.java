package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.place.EventsPlace;
import tr.org.linux.opencourseorganizer.client.provider.EventsDataProvider;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;

import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class EventsPresenter implements EventsDisplay.Presenter {

	private final EventsDisplay view;
	private EventBus eventBus;
	private AppRequestFactory factory;

	@Inject
	public EventsPresenter(final EventsDisplay view) {
		this.view = view;
		view.setPresenter(this);
	}

	@Override
	public void setEventBus(EventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public void setRequestFactory(AppRequestFactory factory) {
		this.factory = factory;
	}

	@Override
	public void go(AcceptsOneWidget panel) {
		panel.setWidget(view);
		loadEvents();
	}

	@Override
	public void goEventDetailView(Long eventId) {
		eventBus.fireEvent(new PlaceChangeEvent(new EventsPlace(eventId)));
	}

	private void loadEvents() {
		EventsDataProvider dataProvider = new EventsDataProvider(factory);
		dataProvider.addDataDisplay(view.getCellList());
	}

}
