package tr.org.linux.opencourseorganizer.client.activity;

import tr.org.linux.opencourseorganizer.client.ClientFactory;
import tr.org.linux.opencourseorganizer.client.place.HomePlace;
import tr.org.linux.opencourseorganizer.client.ui.HomeView;
import tr.org.linux.opencourseorganizer.client.ui.HomeViewUi;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HomeActivity extends AbstractActivity {

	private final ClientFactory clientFactory;

	@Inject
	public HomeActivity(ClientFactory clientFactory, HomePlace place) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		HomeView.Presenter presenter = clientFactory.getHomePresenter();
		presenter.setView(new HomeViewUi());
		presenter.go(panel);
	}

}
