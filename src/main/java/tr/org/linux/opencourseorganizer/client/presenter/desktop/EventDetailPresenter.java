package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

import tr.org.linux.opencourseorganizer.client.ui.EventDetailDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;

public class EventDetailPresenter implements EventDetailDisplay.Presenter {

	private final EventDetailDisplay view;
	@SuppressWarnings("unused")
	private EventBus eventBus;
	@SuppressWarnings("unused")
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
	public void setEventId(Long eventId) {
	}

	@Override
	public void goSubjectView() {
	}

	@Override
	public void findEvent() {
	}

}
