package tr.org.linux.opencourseorganizer.server.service;

import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

public interface EventService {

	public Long count();

	public List<Event> findAll();

	public Event findById(Long id);

	public void save(Event event);

}