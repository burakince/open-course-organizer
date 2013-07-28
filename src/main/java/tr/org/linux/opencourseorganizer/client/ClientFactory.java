package tr.org.linux.opencourseorganizer.client;

import tr.org.linux.opencourseorganizer.client.application.App;
import tr.org.linux.opencourseorganizer.client.ui.Home;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.event.shared.EventBus;

public interface ClientFactory extends Ginjector {

	App getApp();

	EventBus getEventBus();

	PlaceController getPlaceController();

	ActivityMapper getActivityMapper();

	PlaceHistoryMapper getPlaceHistoryMapper();

	Home.Presenter getHomePresenter();

}
