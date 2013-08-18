package tr.org.linux.opencourseorganizer.server.domain;

import tr.org.linux.opencourseorganizer.server.dao.EventDao;
import tr.org.linux.opencourseorganizer.server.dao.EventDaoMock;

import com.google.web.bindery.requestfactory.shared.Locator;

public class EventLocator extends Locator<Event, Long> {

	@Override
	public Event create(Class<? extends Event> clazz) {
		return new Event();
	}

	@Override
	public Event find(Class<? extends Event> clazz, Long id) {
		EventDao dao = new EventDaoMock();
		return dao.findById(id);
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
