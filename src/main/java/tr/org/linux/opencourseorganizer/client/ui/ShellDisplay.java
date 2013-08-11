package tr.org.linux.opencourseorganizer.client.ui;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.EventBus;

public interface ShellDisplay extends AcceptsOneWidget, IsWidget {

	public interface Presenter {

		ShellDisplay getView();

		void setEventBus(EventBus eventBus);

	}

	void setPresenter(Presenter presenter);

}
