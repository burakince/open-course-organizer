package tr.org.linux.opencourseorganizer.server.dao;

import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;
import tr.org.linux.opencourseorganizer.server.domain.Subject;

public interface Dao {

	Long countEvents();

	List<Event> findAllEvents();

	Event findEventById(Long id);

	void saveEvent(Event event);

	Long countSubjects();

	List<Subject> findAllSubjects();

	Subject findSubjectById(Long id);

	List<Subject> findSubjectsByEventId(Long eventId);

	void saveSubject(Subject subject);

}
