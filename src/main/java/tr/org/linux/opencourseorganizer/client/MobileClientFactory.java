package tr.org.linux.opencourseorganizer.client;

import tr.org.linux.opencourseorganizer.client.application.App;
import tr.org.linux.opencourseorganizer.client.exception.UnsupportedClientException;
import tr.org.linux.opencourseorganizer.client.ui.desktop.HomeView;
import tr.org.linux.opencourseorganizer.client.ui.desktop.HomeView.Presenter;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.web.bindery.event.shared.EventBus;

public class MobileClientFactory implements ClientFactory {

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
	public Presenter getHomePresenter() {
		throw new UnsupportedClientException();
	}

	@Override
	public HomeView getHomeView() {
		throw new UnsupportedClientException();
	}

}
