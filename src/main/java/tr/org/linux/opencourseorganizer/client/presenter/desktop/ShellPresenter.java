package tr.org.linux.opencourseorganizer.client.presenter.desktop;

import tr.org.linux.opencourseorganizer.client.ui.ShellDisplay;
import tr.org.linux.opencourseorganizer.client.ui.desktop.ShellView;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ShellPresenter implements ShellDisplay.Presenter {

	private final ShellView view;
	@SuppressWarnings("unused")
	private EventBus eventBus;

	@Inject
	public ShellPresenter(final ShellView view) {
		this.view = view;
		this.view.setPresenter(this);
	}

	@Override
	public void setEventBus(EventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public ShellDisplay getView() {
		return view;
	}

}
