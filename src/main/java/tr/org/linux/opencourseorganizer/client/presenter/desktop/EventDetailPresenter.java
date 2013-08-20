package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import java.util.List;

import tr.org.linux.opencourseorganizer.client.place.SubjectPlace;
import tr.org.linux.opencourseorganizer.client.ui.EventDetailDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory.EventRequest;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory.SubjectRequest;
import tr.org.linux.opencourseorganizer.shared.EventProxy;
import tr.org.linux.opencourseorganizer.shared.SubjectProxy;

import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class EventDetailPresenter implements EventDetailDisplay.Presenter {

	private final EventDetailDisplay view;
	private EventBus eventBus;
	private AppRequestFactory factory;

	@Inject
	public EventDetailPresenter(final EventDetailDisplay view) {
		this.view = view;
		view.setPresenter(this);
	}

	@Override
	public void setEventBus(EventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public void setRequestFactory(AppRequestFactory factory) {
		this.factory = factory;
	}

	@Override
	public void go(AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

	@Override
	public void loadEvent(Long eventId) {
		EventRequest eventRequest = factory.eventRequest();

		eventRequest.findById(eventId).fire(new Receiver<EventProxy>() {
			@Override
			public void onSuccess(EventProxy response) {
				view.loadEvent(response);
			}
		});

		SubjectRequest subjectRequest = factory.subjectRequest();

		subjectRequest.findByEventId(eventId).fire(new Receiver<List<SubjectProxy>>() {
			@Override
			public void onSuccess(List<SubjectProxy> response) {
				view.loadSubjects(response);
			}
		});
	}

	@Override
	public void goSubjectView(Long subjectId) {
		eventBus.fireEvent(new PlaceChangeEvent(new SubjectPlace(subjectId)));
	}

}
