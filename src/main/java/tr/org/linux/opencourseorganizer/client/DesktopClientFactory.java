package tr.org.linux.opencourseorganizer.client;

import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class DesktopClientFactory implements ClientFactory {

	private App app = new App();
	private SimpleEventBus eventBus = new SimpleEventBus();

	@Override
	public App getApp() {
		return app;
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

}
