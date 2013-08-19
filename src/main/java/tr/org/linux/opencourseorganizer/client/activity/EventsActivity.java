package tr.org.linux.opencourseorganizer.client.activity;

import tr.org.linux.opencourseorganizer.client.ClientFactory;
import tr.org.linux.opencourseorganizer.client.place.EventsPlace;
import tr.org.linux.opencourseorganizer.client.ui.EventDetailDisplay;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;

public class EventsActivity extends AbstractActivity {

	private final ClientFactory clientFactory;
	private final EventsPlace place;

	@Inject
	public EventsActivity(final ClientFactory clientFactory, @Assisted EventsPlace place) {
		this.clientFactory = clientFactory;
		this.place = place;
	}

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		if (place.getEventId().equals(0L)) {
			final EventsDisplay.Presenter presenter = clientFactory.getEventsPresenter();
			presenter.setEventBus(eventBus);
			presenter.setRequestFactory(clientFactory.getRequestFactory());
			presenter.go(panel);
		} else {
			final EventDetailDisplay.Presenter presenter = clientFactory.getEventDetailPresenter();
			presenter.setEventBus(eventBus);
			presenter.setRequestFactory(clientFactory.getRequestFactory());
			presenter.go(panel);
		}
	}

}
