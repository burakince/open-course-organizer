package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.place.EventsPlace;
import tr.org.linux.opencourseorganizer.client.ui.SubjectDisplay;
import tr.org.linux.opencourseorganizer.client.ui.SubjectDisplay.Presenter;

import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class SubjectPresenter implements Presenter {

	private final SubjectDisplay view;
	private EventBus eventBus;

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
	public void go(final AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

	@Override
	public void goEventsView() {
		eventBus.fireEvent(new PlaceChangeEvent(new EventsPlace("Kamp 2013")));
	}

}
