package tr.org.linux.opencourseorganizer.client.activity;

import tr.org.linux.opencourseorganizer.client.ClientFactory;
import tr.org.linux.opencourseorganizer.client.ui.HomeDisplay;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HomeActivity extends AbstractActivity {

	private final ClientFactory clientFactory;

	@Inject
	public HomeActivity(final ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		final HomeDisplay.Presenter presenter = clientFactory.getHomePresenter();
		presenter.setEventBus(eventBus);
		presenter.go(panel);
	}

}
