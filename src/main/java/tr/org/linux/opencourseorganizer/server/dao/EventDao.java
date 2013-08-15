package tr.org.linux.opencourseorganizer.server.dao;

import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

public interface EventDao {

	public Long countEvents();

	public List<Event> findAllEvents();

	public Event findById(Long id);

	public void save(Event event);

}