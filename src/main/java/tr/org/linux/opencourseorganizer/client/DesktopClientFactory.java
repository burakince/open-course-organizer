package tr.org.linux.opencourseorganizer.client;

import tr.org.linux.opencourseorganizer.client.ioc.DesktopInjector;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public class DesktopClientFactory implements ClientFactory {

	private final DesktopInjector injector = GWT.create(DesktopInjector.class);

	@Override
	public App getApp() {
		return injector.getApp();
	}

	@Override
	public EventBus getEventBus() {
		return injector.getEventBus();
	}

	@Override
	public PlaceController getPlaceController() {
		return injector.getPlaceController();
	}

}
