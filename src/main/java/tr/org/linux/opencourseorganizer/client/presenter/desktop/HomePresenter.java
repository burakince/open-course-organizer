package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.ui.desktop.HomeDisplay;
import tr.org.linux.opencourseorganizer.client.ui.desktop.HomeDisplay.Presenter;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class HomePresenter implements Presenter {

	private final HomeDisplay view;
	@SuppressWarnings("unused")
	private final EventBus eventBus;

	@Inject
	public HomePresenter(final EventBus eventBus, final HomeDisplay view) {
		this.view = view;
		this.eventBus = eventBus;
		view.setPresenter(this);
	}

	@Override
	public void go(final AcceptsOneWidget panel) {
		panel.setWidget(view);
	}

}
