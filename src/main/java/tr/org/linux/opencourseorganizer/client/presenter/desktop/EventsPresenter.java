package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

import tr.org.linux.opencourseorganizer.client.ui.desktop.EventsDisplay;
import tr.org.linux.opencourseorganizer.client.ui.desktop.EventsDisplay.Presenter;

public class EventsPresenter implements Presenter {

	private final EventsDisplay view;
	@SuppressWarnings("unused")
	private final EventBus eventBus;

	@Inject
	public EventsPresenter(final EventBus eventBus, final EventsDisplay view) {
		this.eventBus = eventBus;
		this.view = view;
		view.setPresenter(this);
	}

	@Override
	public void go(AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

}
