package tr.org.linux.opencourseorganizer.server.dao;

import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

public interface EventService {

	public Long countEvents();

	public List<Event> findAll();

	public Event findById(Long id);

	public void save(Event event);

}