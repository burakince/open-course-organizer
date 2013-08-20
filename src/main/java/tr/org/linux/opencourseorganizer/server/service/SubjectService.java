package tr.org.linux.opencourseorganizer.server.service;

import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Subject;

public interface SubjectService {

	public Long count();

	public List<Subject> findAll();

	public Subject findById(Long id);

	public List<Subject> findByEventId(Long eventId);

	public void save(Subject subject);

}