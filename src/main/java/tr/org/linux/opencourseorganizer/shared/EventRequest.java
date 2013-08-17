package tr.org.linux.opencourseorganizer.shared;

import java.util.List;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(value = tr.org.linux.opencourseorganizer.server.dao.EventDao.class, locator = tr.org.linux.opencourseorganizer.server.domain.AppServiceLocator.class)
public interface EventRequest extends RequestContext {

	Request<Long> countEvents();

	Request<List<EventProxy>> findAll();

	Request<EventProxy> findById(Long id);

	Request<Void> save(EventProxy event);

	// InstanceRequest<EventProxy, Void> persist();
	//
	// InstanceRequest<EventProxy, Void> remove();

}
