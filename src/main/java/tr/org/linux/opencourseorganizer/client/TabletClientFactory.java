package tr.org.linux.opencourseorganizer.client;

import tr.org.linux.opencourseorganizer.client.application.App;
import tr.org.linux.opencourseorganizer.client.exception.UnsupportedClientException;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.client.ui.HomeDisplay;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryMapper;
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

	@Override
	public ActivityMapper getActivityMapper() {
		throw new UnsupportedClientException();
	}

	@Override
	public PlaceHistoryMapper getPlaceHistoryMapper() {
		throw new UnsupportedClientException();
	}

	@Override
	public HomeDisplay.Presenter getHomePresenter() {
		throw new UnsupportedClientException();
	}

	@Override
	public EventsDisplay.Presenter getEventsPresenter() {
		throw new UnsupportedClientException();
	}

}
