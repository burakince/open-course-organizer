package tr.org.linux.opencourseorganizer.server.domain;

import tr.org.linux.opencourseorganizer.server.ioc.ServiceModule;
import tr.org.linux.opencourseorganizer.server.service.EventService;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.web.bindery.requestfactory.shared.Locator;

public class EventLocator extends Locator<Event, Long> {

	private final Injector injector = Guice.createInjector(new ServiceModule());

	@Override
	public Event create(Class<? extends Event> clazz) {
		return new Event();
	}

	@Override
	public Event find(Class<? extends Event> clazz, Long id) {
		EventService service = injector.getInstance(EventService.class);
		return service.findById(id);
	}

	@Override
	public Class<Event> getDomainType() {
		return Event.class;
	}

	@Override
	public Long getId(Event domainObject) {
		return domainObject.getId();
	}

	@Override
	public Class<Long> getIdType() {
		return Long.class;
	}

	@Override
	public Object getVersion(Event domainObject) {
		return domainObject.getVersion();
	}

}
