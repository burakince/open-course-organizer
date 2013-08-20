package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import java.util.List;

import tr.org.linux.opencourseorganizer.client.place.EventsPlace;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory.EventRequest;
import tr.org.linux.opencourseorganizer.shared.EventProxy;

import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;

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
		EventRequest request = factory.eventRequest();

		request.findAll().fire(new Receiver<List<EventProxy>>() {
			@Override
			public void onSuccess(List<EventProxy> response) {
				view.loadEvent(response);
			}
		});
	}

}
