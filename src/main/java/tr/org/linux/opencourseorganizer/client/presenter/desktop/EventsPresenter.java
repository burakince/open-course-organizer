package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.place.SubjectPlace;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay.Presenter;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;
import tr.org.linux.opencourseorganizer.shared.EventRequest;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class EventsPresenter implements Presenter {

	private final EventsDisplay view;
	private EventBus eventBus;

	@Inject
	public EventsPresenter(final EventsDisplay view) {
		this.view = view;
		view.setPresenter(this);
	}

	@Override
	public void setEventBus(EventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public void go(AcceptsOneWidget panel) {
		panel.setWidget(view);
		AppRequestFactory factory = GWT.create(AppRequestFactory.class);
		factory.initialize(eventBus);
		EventRequest request = factory.eventRequest();
		view.setEvents(request.findAllEvents());
	}

	@Override
	public void goSubjectView() {
		eventBus.fireEvent(new PlaceChangeEvent(new SubjectPlace("Linux Sistem Yönetimi (1. Düzey)")));
	}

}
