package tr.org.linux.opencourseorganizer.client;

import tr.org.linux.opencourseorganizer.client.app.App;
import tr.org.linux.opencourseorganizer.client.exception.UnsupportedClientException;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public class TabletClientFactory implements ClientFactory {

	@Override
	public App getApp() {
		throw new UnsupportedClientException();
	}

	@Override
	public EventBus getEventBus() {
		throw new UnsupportedClientException();
	}

	@Override
	public PlaceController getPlaceController() {
		throw new UnsupportedClientException();
	}

}
