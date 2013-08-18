package tr.org.linux.opencourseorganizer.server.dao;

import java.util.ArrayList;
import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

public class EventDaoImpl implements EventDao {

	private Event event;
	private List<Event> events = new ArrayList<Event>();

	public EventDaoImpl() {
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
	public List<Event> findAll() {
		return events;
	}

	@Override
	public Event findById(Long id) {
		for (Event event : events)
			if (event.getId().equals(id))
				return event;
		return this.event;
	}

	@Override
	public void save(Event event) {
		events.add(event);
	}

}
