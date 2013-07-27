package tr.org.linux.opencourseorganizer.client;

import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class DesktopClientFactory implements ClientFactory {

	@Override
	public App getApp() {
		return new App();
	}

	@Override
	public EventBus getEventBus() {
		return new SimpleEventBus();
	}

}
