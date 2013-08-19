package tr.org.linux.opencourseorganizer.client;

import tr.org.linux.opencourseorganizer.client.application.App;
import tr.org.linux.opencourseorganizer.client.ui.EventDetailDisplay;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.client.ui.SubjectDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.web.bindery.event.shared.EventBus;

public interface ClientFactory extends Ginjector {

	App getApp();

	EventBus getEventBus();

	PlaceController getPlaceController();

	ActivityMapper getActivityMapper();

	PlaceHistoryMapper getPlaceHistoryMapper();

	AppRequestFactory getRequestFactory();

	EventsDisplay.Presenter getEventsPresenter();

	EventDetailDisplay.Presenter getEventDetailPresenter();

	SubjectDisplay.Presenter getSubjectPresenter();

}
