package tr.org.linux.opencourseorganizer.client.activity;

import tr.org.linux.opencourseorganizer.client.ClientFactory;
import tr.org.linux.opencourseorganizer.client.ui.desktop.EventsDisplay;

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
		presenter.go(panel);
	}

}
