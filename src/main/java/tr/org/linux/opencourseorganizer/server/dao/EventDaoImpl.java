package tr.org.linux.opencourseorganizer.server.dao;

import java.util.ArrayList;
import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

public class EventDaoImpl implements EventDao {

	private Event e = new Event();
	private List<Event> events;

	public EventDaoImpl() {
		e.setId(new Long(1));
		e.setName("Kamp2013");
	}

	@Override
	public Long countEvents() {
		return new Long(1);
	}

	@Override
	public List<Event> findAllEvents() {
		events = new ArrayList<Event>();
		events.add(e);
		return events;
	}

	@Override
	public Event findEvent(Long id) {
		return e;
	}

}
