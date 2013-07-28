package tr.org.linux.opencourseorganizer.client.presenter;

import tr.org.linux.opencourseorganizer.client.ui.Home;
import tr.org.linux.opencourseorganizer.client.ui.Home.Presenter;

import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class HomePresenter implements Presenter {

	private Home view;

	@Override
	public void setView(Home view) {
		this.view = view;
	}

	@Override
	public void go(AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

}
