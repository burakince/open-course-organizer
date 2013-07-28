package tr.org.linux.opencourseorganizer.client.ui;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public interface Home extends IsWidget {

	public interface Presenter {

		void setView(Home view);

		void go(AcceptsOneWidget panel);

	}

	void setPresenter(Presenter presenter);

}
