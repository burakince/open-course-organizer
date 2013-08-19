package tr.org.linux.opencourseorganizer.client;

import tr.org.linux.opencourseorganizer.client.application.App;
import tr.org.linux.opencourseorganizer.client.ioc.DesktopInjector;
import tr.org.linux.opencourseorganizer.client.ui.EventDetailDisplay;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.client.ui.SubjectDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryMapper;
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

	@Override
	public ActivityMapper getActivityMapper() {
		return injector.getActivityMapper();
	}

	@Override
	public PlaceHistoryMapper getPlaceHistoryMapper() {
		return injector.getPlaceHistoryMapper();
	}

	@Override
	public AppRequestFactory getRequestFactory() {
		return injector.getRequestFactory();
	}

	@Override
	public EventsDisplay.Presenter getEventsPresenter() {
		return injector.getEventsPresenter();
	}

	@Override
	public EventDetailDisplay.Presenter getEventDetailPresenter() {
		return injector.getEventDetailPresenter();
	}

	@Override
	public SubjectDisplay.Presenter getSubjectPresenter() {
		return injector.getSubjectPresenter();
	}

}
