package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.place.EventsPlace;
import tr.org.linux.opencourseorganizer.client.ui.SubjectDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory.SubjectRequest;
import tr.org.linux.opencourseorganizer.shared.SubjectProxy;

import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class SubjectPresenter implements SubjectDisplay.Presenter {

	private final SubjectDisplay view;
	private EventBus eventBus;
	private AppRequestFactory factory;

	@Inject
	public SubjectPresenter(final SubjectDisplay view) {
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
	public void go(final AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

	@Override
	public void loadSubject(Long subjectId) {
		SubjectRequest request = factory.subjectRequest();

		request.findById(subjectId).fire(new Receiver<SubjectProxy>() {
			@Override
			public void onSuccess(SubjectProxy response) {
				view.loadSubject(response);
			}
		});
	}

	@Override
	public void goEventsView() {
		eventBus.fireEvent(new PlaceChangeEvent(new EventsPlace(0L)));
	}

}
