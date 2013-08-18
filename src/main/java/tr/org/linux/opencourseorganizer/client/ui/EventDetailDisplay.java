package tr.org.linux.opencourseorganizer.client.ui;

import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory.EventRequest;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;

public interface EventDetailDisplay {

	public interface Presenter {

		void go(AcceptsOneWidget panel);

		void setEventBus(EventBus eventBus);

		void setEventId(Long eventId);

		void setRequestFactory(AppRequestFactory factory);

		void goSubjectView();

		void findEvent();

	}

	void setPresenter(Presenter presenter);

	void loadEvent(EventRequest request, Long eventId);

}
