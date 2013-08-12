package tr.org.linux.opencourseorganizer.shared;

import java.util.List;

import tr.org.linux.opencourseorganizer.server.domain.Event;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(Event.class)
public interface EventRequest extends RequestContext {

	Request<Long> countEvents();

	Request<List<EventProxy>> findAllEvents();

	Request<EventProxy> findEvent(Long id);

	InstanceRequest<EventProxy, Void> persist();

	InstanceRequest<EventProxy, Void> remove();

}
