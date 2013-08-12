package tr.org.linux.opencourseorganizer.shared;

import tr.org.linux.opencourseorganizer.server.domain.Event;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(Event.class)
public interface EventProxy extends EntityProxy {

	Long getId();

	void setId(Long id);

	String getName();

	void setName(String name);

	EntityProxyId<EventProxy> stableId();

}
