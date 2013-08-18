package tr.org.linux.opencourseorganizer.server.ioc;

import tr.org.linux.opencourseorganizer.server.dao.Dao;
import tr.org.linux.opencourseorganizer.server.dao.MockDao;
import tr.org.linux.opencourseorganizer.server.service.EventService;
import tr.org.linux.opencourseorganizer.server.service.EventServiceImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class ServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(EventService.class).to(EventServiceImpl.class).in(Singleton.class);

		bind(Dao.class).to(MockDao.class);
	}

}
