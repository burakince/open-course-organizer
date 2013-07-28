package tr.org.linux.opencourseorganizer.client.presenter;

import tr.org.linux.opencourseorganizer.client.ui.HomeView;
import tr.org.linux.opencourseorganizer.client.ui.HomeView.Presenter;

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
