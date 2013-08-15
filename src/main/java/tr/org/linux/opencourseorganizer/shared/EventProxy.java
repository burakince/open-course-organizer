package tr.org.linux.opencourseorganizer.shared;

import tr.org.linux.opencourseorganizer.server.domain.Event;
import tr.org.linux.opencourseorganizer.server.domain.EventLocator;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(value = Event.class, locator = EventLocator.class)
public interface EventProxy extends EntityProxy {

	Long getId();

	String getName();

	void setName(String name);

//	EntityProxyId<EventProxy> stableId();

}
