package tr.org.linux.opencourseorganizer.shared;

import java.util.List;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import com.google.web.bindery.requestfactory.shared.Service;

public interface AppRequestFactory extends RequestFactory {

	@Service(value = tr.org.linux.opencourseorganizer.server.service.EventService.class, locator = tr.org.linux.opencourseorganizer.server.domain.GuiceServiceLocator.class)
	public interface EventRequest extends RequestContext {

		Request<Long> count();

		Request<List<EventProxy>> findAll();

		Request<EventProxy> findById(Long id);

		Request<Void> save(EventProxy event);

		// InstanceRequest<EventProxy, Void> persist();
		//
		// InstanceRequest<EventProxy, Void> remove();

	}

	EventRequest eventRequest();

}
