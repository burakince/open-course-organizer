package tr.org.linux.opencourseorganizer.server.domain;

import tr.org.linux.opencourseorganizer.server.ioc.ServiceModule;
import tr.org.linux.opencourseorganizer.server.service.SubjectService;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.web.bindery.requestfactory.shared.Locator;

public class SubjectLocator extends Locator<Subject, Long> {

	private final Injector injector = Guice.createInjector(new ServiceModule());

	@Override
	public Subject create(Class<? extends Subject> clazz) {
		return new Subject();
	}

	@Override
	public Subject find(Class<? extends Subject> clazz, Long id) {
		SubjectService service = injector.getInstance(SubjectService.class);
		return service.findById(id);
	}

	@Override
	public Class<Subject> getDomainType() {
		return Subject.class;
	}

	@Override
	public Long getId(Subject domainObject) {
		return domainObject.getId();
	}

	@Override
	public Class<Long> getIdType() {
		return Long.class;
	}

	@Override
	public Object getVersion(Subject domainObject) {
		return domainObject.getVersion();
	}

}
