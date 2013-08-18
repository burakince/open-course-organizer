package tr.org.linux.opencourseorganizer.server.dao;

import java.util.ArrayList;
import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

public class MockDao implements Dao {

	private Event event;
	private List<Event> events = new ArrayList<Event>();

	public MockDao() {
		event = new Event(1L, "AB 2012");
		events.add(event);
		events.add(new Event(2L, "Kamp 2012"));
		events.add(new Event(3L, "AB 2013"));
		events.add(new Event(4L, "Kamp 2013"));
	}

	@Override
	public Long countEvents() {
		return (long) events.size();
	}

	@Override
	public List<Event> findAllEvents() {
		return events;
	}

	@Override
	public Event findEventById(Long id) {
		for (Event event : events)
			if (event.getId().equals(id))
				return event;
		return this.event;
	}

	@Override
	public void saveEvent(Event event) {
		events.add(event);
	}

}
