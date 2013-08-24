package tr.org.linux.opencourseorganizer.server.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;
import tr.org.linux.opencourseorganizer.server.domain.Subject;

public class MockDao implements Dao {

	private List<Event> events = new ArrayList<Event>();
	private List<Subject> subjects = new ArrayList<Subject>();

	public MockDao() {
		events.add(new Event(1L, "AB 2012", "Uşak Üniversitesi"));
		events.add(new Event(2L, "Kamp 2012", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(3L, "AB 2013", "Akdeniz Üniversitesi"));
		events.add(new Event(4L, "Kamp 2013", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(5L, "AB 2012", "Uşak Üniversitesi"));
		events.add(new Event(6L, "Kamp 2012", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(7L, "AB 2013", "Akdeniz Üniversitesi"));
		events.add(new Event(8L, "Kamp 2013", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(9L, "AB 2012", "Uşak Üniversitesi"));
		events.add(new Event(10L, "Kamp 2012", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(11L, "AB 2013", "Akdeniz Üniversitesi"));
		events.add(new Event(12L, "Kamp 2013", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(13L, "AB 2012", "Uşak Üniversitesi"));
		events.add(new Event(14L, "Kamp 2012", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(15L, "AB 2013", "Akdeniz Üniversitesi"));
		events.add(new Event(16L, "Kamp 2013", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(17L, "AB 2012", "Uşak Üniversitesi"));
		events.add(new Event(18L, "Kamp 2012", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(19L, "AB 2013", "Akdeniz Üniversitesi"));
		events.add(new Event(20L, "Kamp 2013", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(21L, "AB 2012", "Uşak Üniversitesi"));
		events.add(new Event(22L, "Kamp 2012", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(23L, "AB 2013", "Akdeniz Üniversitesi"));
		events.add(new Event(24L, "Kamp 2013", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(25L, "AB 2012", "Uşak Üniversitesi"));
		events.add(new Event(26L, "Kamp 2012", "Bolu Abant İzzet Baysal Üniversitesi"));
		events.add(new Event(27L, "AB 2013", "Akdeniz Üniversitesi"));
		events.add(new Event(28L, "Kamp 2013", "Bolu Abant İzzet Baysal Üniversitesi"));
		subjects.add(new Subject(1L, "Kurs 1", new Date(), 1L));
		subjects.add(new Subject(2L, "Kurs 2", new Date(), 2L));
		subjects.add(new Subject(3L, "Kurs 3", new Date(), 3L));
		subjects.add(new Subject(4L, "Kurs 4", new Date(), 4L));
		subjects.add(new Subject(5L, "Kurs 5", new Date(), 1L));
		subjects.add(new Subject(6L, "Kurs 6", new Date(), 3L));
		subjects.add(new Subject(7L, "Kurs 7", new Date(), 4L));
		subjects.add(new Subject(8L, "Kurs 8", new Date(), 2L));
		subjects.add(new Subject(9L, "Kurs 9", new Date(), 2L));
		subjects.add(new Subject(10L, "Kurs 10", new Date(), 4L));
		subjects.add(new Subject(11L, "Kurs 11", new Date(), 1L));
		subjects.add(new Subject(12L, "Kurs 12", new Date(), 3L));
		subjects.add(new Subject(13L, "Kurs 13", new Date(), 4L));
		subjects.add(new Subject(14L, "Kurs 14", new Date(), 3L));
		subjects.add(new Subject(15L, "Kurs 15", new Date(), 2L));
		subjects.add(new Subject(15L, "Kurs 16", new Date(), 1L));
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
		return new Event();
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
		return new Subject();
	}

	@Override
	public List<Subject> findSubjectsByEventId(Long eventId) {
		List<Subject> subjects = new ArrayList<Subject>();
		for (Subject subject : this.subjects)
			if (subject.getEventId().equals(eventId))
				subjects.add(subject);
		return subjects;
	}

	@Override
	public void saveSubject(Subject subject) {
		subjects.add(subject);
	}

}
