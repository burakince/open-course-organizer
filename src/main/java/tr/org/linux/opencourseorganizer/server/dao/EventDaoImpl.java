package tr.org.linux.opencourseorganizer.server.dao;

import java.util.ArrayList;
import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

public class EventDaoImpl implements EventDao {

	private Event event = new Event();
	private List<Event> events = new ArrayList<Event>();

	public EventDaoImpl() {
		event.setId(new Long(1));
		event.setName("Kamp2013");
		event.setVersion(new Long(1));
		events.add(event);
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
