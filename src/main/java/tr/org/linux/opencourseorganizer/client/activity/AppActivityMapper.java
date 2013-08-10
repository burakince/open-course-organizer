package tr.org.linux.opencourseorganizer.client.activity;

import tr.org.linux.opencourseorganizer.client.ClientFactory;
import tr.org.linux.opencourseorganizer.client.place.Events;
import tr.org.linux.opencourseorganizer.client.place.Home;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;

public class AppActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	@Inject
	public AppActivityMapper(final ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(final Place place) {
		if (place instanceof Home)
			return new HomeActivity(clientFactory);
		else if (place instanceof Events)
			return new EventsActivity(clientFactory);
		return null;
	}

}
