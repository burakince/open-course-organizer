package tr.org.linux.opencourseorganizer.server.dao;

import java.util.ArrayList;
import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;
import tr.org.linux.opencourseorganizer.server.domain.Subject;

public class MockDao implements Dao {

	private Event event;
	private List<Event> events = new ArrayList<Event>();
	private Subject subject;
	private List<Subject> subjects = new ArrayList<Subject>();

	public MockDao() {
		event = new Event(1L, "AB 2012", "Uşak Üniversitesi");
		events.add(event);
		events.add(new Event(2L, "Kamp 2012", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(3L, "AB 2013", "Akdeniz Üniversitesi"));
		events.add(new Event(4L, "Kamp 2013", "Bolu Abant İzzet Baysal Üniversitesi"));
		subject = new Subject();
		subjects.add(subject);
	}

	@Override
	public Long countEvents() {
		return (long) events.size();
	}

	@Override
	public List<Event> findAllEvents() {
		return events;
	}

	@Override
	public Event findEventById(Long id) {
		for (Event event : events)
			if (event.getId().equals(id))
				return event;
		return this.event;
	}

	@Override
	public void saveEvent(Event event) {
		events.add(event);
	}

	@Override
	public Long countSubjects() {
		return (long) subjects.size();
	}

	@Override
	public List<Subject> findAllSubjects() {
		return subjects;
	}

	@Override
	public Subject findSubjectById(Long id) {
		for (Subject subject : subjects)
			if (subject.getId().equals(id))
				return subject;
		return this.subject;
	}

	@Override
	public void saveSubject(Subject subject) {
		subjects.add(subject);
	}

}
