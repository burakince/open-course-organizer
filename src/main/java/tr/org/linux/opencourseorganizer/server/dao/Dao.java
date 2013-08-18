package tr.org.linux.opencourseorganizer.server.dao;

import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

public interface Dao {

	Long countEvents();

	List<Event> findAllEvents();

	Event findEventById(Long id);

	void saveEvent(Event event);

}
