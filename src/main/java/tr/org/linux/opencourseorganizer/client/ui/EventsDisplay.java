package tr.org.linux.opencourseorganizer.client.ui;

import java.util.List;

import tr.org.linux.opencourseorganizer.shared.EventProxy;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.requestfactory.shared.Request;

public interface EventsDisplay extends IsWidget {

	public interface Presenter {

		void go(AcceptsOneWidget panel);

		void setEventBus(EventBus eventBus);

		void goSubjectView();

	}

	void setPresenter(Presenter presenter);

	void setEvents(Request<List<EventProxy>> request);

}
