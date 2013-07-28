package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.ui.desktop.HomeView;
import tr.org.linux.opencourseorganizer.client.ui.desktop.HomeView.Presenter;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HomePresenter implements Presenter {

	private HomeView view;
	@SuppressWarnings("unused")
	private EventBus eventBus;

	@Inject
	public HomePresenter(EventBus eventBus, HomeView view) {
		this.view = view;
		this.eventBus = eventBus;
		view.setPresenter(this);
	}

	@Override
	public void go(AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

}
