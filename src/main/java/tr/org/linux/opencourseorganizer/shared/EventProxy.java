package tr.org.linux.opencourseorganizer.shared;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
//import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(value = tr.org.linux.opencourseorganizer.server.domain.Event.class, locator = tr.org.linux.opencourseorganizer.server.domain.EventLocator.class)
public interface EventProxy extends EntityProxy {

	Long getId();

	String getName();

	void setName(String name);

	String getLocation();

	void setLocation(String location);

//	@Override
//	public EntityProxyId<EventProxy> stableId();

}
