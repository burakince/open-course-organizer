package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.place.SubjectPlace;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay.Presenter;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory.EventRequest;

import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class EventsPresenter implements Presenter {

	private final EventsDisplay view;
	private EventBus eventBus;
	private AppRequestFactory factory;

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
	public void setRequestFactory(AppRequestFactory factory) {
		this.factory = factory;
	}

	@Override
	public void go(AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

	@Override
	public void goSubjectView() {
		eventBus.fireEvent(new PlaceChangeEvent(new SubjectPlace("Linux Sistem Yönetimi (1. Düzey)")));
	}

	@Override
	public void findEvent() {
		EventRequest request = factory.eventRequest();
		view.loadEvent(request.findAll());
	}

}
