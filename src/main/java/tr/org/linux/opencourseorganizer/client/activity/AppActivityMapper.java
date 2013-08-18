package tr.org.linux.opencourseorganizer.client.activity;

import tr.org.linux.opencourseorganizer.client.place.EventsPlace;
import tr.org.linux.opencourseorganizer.client.place.SubjectPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;

public class AppActivityMapper implements ActivityMapper {

	public interface Factory {

		EventsActivity eventsActivity(EventsPlace place);

		SubjectActivity subjectActivity(SubjectPlace place);

	}

	private final Factory factory;

	@Inject
	public AppActivityMapper(final Factory factory) {
		this.factory = factory;
	}

	@Override
	public Activity getActivity(final Place place) {

		if (place instanceof SubjectPlace)
			return factory.subjectActivity((SubjectPlace) place);
		else if (place instanceof EventsPlace)
			return factory.eventsActivity((EventsPlace) place);

		return null;
	}

}
