package tr.org.linux.opencourseorganizer.shared;

import java.util.List;

import tr.org.linux.opencourseorganizer.server.dao.EventDao;
import tr.org.linux.opencourseorganizer.server.dao.EventDaoImpl;
import tr.org.linux.opencourseorganizer.server.domain.AppServiceLocator;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(value = EventDao.class, locator = AppServiceLocator.class)
public interface EventRequest extends RequestContext {

	Request<Long> countEvents();

	Request<List<EventProxy>> findAllEvents();

	Request<EventProxy> findById(Long id);

	Request<Void> save(EventProxy event);

//	InstanceRequest<EventProxy, Void> persist();
//
//	InstanceRequest<EventProxy, Void> remove();

}
