package tr.org.linux.opencourseorganizer.client.ui.desktop;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public interface HomeView extends IsWidget {

	public interface Presenter {

		void setView(HomeView view);

		void go(AcceptsOneWidget panel);

	}

	void setPresenter(Presenter presenter);

}
