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
		events.add(event);
	}

	@Override
	public Long countEvents() {
		return new Long(1);
	}

	@Override
	public List<Event> findAllEvents() {
		return events;
	}

	@Override
	public Event findById(Long id) {
		return event;
	}

	@Override
	public void save(Event event) {
		events.add(event);
	}

}
