package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.ui.desktop.HomeView;
import tr.org.linux.opencourseorganizer.client.ui.desktop.HomeView.Presenter;

import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class HomePresenter implements Presenter {

	private HomeView view;

	@Override
	public void setView(HomeView view) {
		this.view = view;
	}

	@Override
	public void go(AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

}
