package tr.org.linux.opencourseorganizer.server.domain;

import tr.org.linux.opencourseorganizer.server.dao.EventDaoImpl;

import com.google.web.bindery.requestfactory.shared.ServiceLocator;

public class AppServiceLocator implements ServiceLocator {

	@Override
	public Object getInstance(Class<?> clazz) {
//		try {
//			return clazz.newInstance();
//		} catch (InstantiationException e) {
//			throw new RuntimeException(e);
//		} catch (IllegalAccessException e) {
//			throw new RuntimeException(e);
//		}
		return new EventDaoImpl();
	}

}
