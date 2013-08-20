package tr.org.linux.opencourseorganizer.client.ui;

import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;
import tr.org.linux.opencourseorganizer.shared.SubjectProxy;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.EventBus;

public interface SubjectDisplay extends IsWidget {

	public interface Presenter {

		void go(AcceptsOneWidget panel);

		void setEventBus(EventBus eventBus);

		void setRequestFactory(AppRequestFactory factory);

		void loadSubject(Long subjectId);

		void goEventsView();

	}

	void setPresenter(Presenter presenter);

	void loadSubject(SubjectProxy response);

}
