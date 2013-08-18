package tr.org.linux.opencourseorganizer.server.ioc;

import tr.org.linux.opencourseorganizer.server.dao.EventService;
import tr.org.linux.opencourseorganizer.server.dao.EventDaoMock;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class DaoModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(EventService.class).to(EventDaoMock.class).in(Singleton.class);
	}

}
