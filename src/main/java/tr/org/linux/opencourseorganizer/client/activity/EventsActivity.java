package tr.org.linux.opencourseorganizer.client.activity;

import tr.org.linux.opencourseorganizer.client.ClientFactory;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class EventsActivity extends AbstractActivity {

	private final ClientFactory clientFactory;

	@Inject
	public EventsActivity(final ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		final EventsDisplay.Presenter presenter = clientFactory.getEventsPresenter();
		presenter.setEventBus(eventBus);
		AppRequestFactory factory = GWT.create(AppRequestFactory.class);
		factory.initialize(eventBus);
		presenter.setRequestFactory(factory);
		presenter.go(panel);
	}

}
