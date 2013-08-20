package tr.org.linux.opencourseorganizer.server.service;

import java.util.List;

import com.google.inject.Inject;

import tr.org.linux.opencourseorganizer.server.dao.Dao;
import tr.org.linux.opencourseorganizer.server.domain.Subject;

public class SubjectServiceImpl implements SubjectService {

	private final Dao dao;

	@Inject
	public SubjectServiceImpl(final Dao dao) {
		this.dao = dao;
	}

	@Override
	public Long count() {
		return dao.countSubjects();
	}

	@Override
	public List<Subject> findAll() {
		return dao.findAllSubjects();
	}

	@Override
	public Subject findById(Long id) {
		return dao.findSubjectById(id);
	}

	@Override
	public void save(Subject subject) {
		dao.saveSubject(subject);
	}

}
