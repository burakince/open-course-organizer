package tr.org.linux.opencourseorganizer.server.ioc;

import tr.org.linux.opencourseorganizer.server.dao.EventDao;
import tr.org.linux.opencourseorganizer.server.dao.EventDaoMock;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class DesktopModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(EventDao.class).to(EventDaoMock.class).in(Singleton.class);
	}

}
