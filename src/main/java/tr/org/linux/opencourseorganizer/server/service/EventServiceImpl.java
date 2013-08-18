package tr.org.linux.opencourseorganizer.server.service;

import java.util.List;

import com.google.inject.Inject;

import tr.org.linux.opencourseorganizer.server.dao.Dao;
import tr.org.linux.opencourseorganizer.server.domain.Event;

public class EventServiceImpl implements EventService {

	private final Dao dao;

	@Inject
	public EventServiceImpl(final Dao dao) {
		this.dao = dao;
	}

	@Override
	public Long count() {
		return dao.countEvents();
	}

	@Override
	public List<Event> findAll() {
		return dao.findAllEvents();
	}

	@Override
	public Event findById(Long id) {
		return dao.findEventById(id);
	}

	@Override
	public void save(Event event) {
		dao.saveEvent(event);
	}

}
