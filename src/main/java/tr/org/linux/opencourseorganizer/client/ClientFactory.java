package tr.org.linux.opencourseorganizer.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public interface ClientFactory {

	App getApp();

	EventBus getEventBus();

	PlaceController getPlaceController();

}
