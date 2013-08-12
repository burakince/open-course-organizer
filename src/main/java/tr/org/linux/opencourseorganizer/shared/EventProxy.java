package tr.org.linux.opencourseorganizer.shared;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(tr.org.linux.opencourseorganizer.server.domain.Event.class)
public interface EventProxy extends EntityProxy {

	Long getId();

	void setId(Long id);

	String getName();

	void setName(String name);

	EntityProxyId<EventProxy> stableId();

}
