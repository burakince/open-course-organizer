package tr.org.linux.opencourseorganizer.shared;

import java.util.Date;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(value = tr.org.linux.opencourseorganizer.server.domain.Subject.class, locator = tr.org.linux.opencourseorganizer.server.domain.SubjectLocator.class)
public interface SubjectProxy extends EntityProxy {

	Long getId();

	String getName();

	void setName(String name);

	Date getSignUpDeadline();

	void setSignUpDeadline(Date signUpDeadline);

	Long getEventId();

	void setEventId(Long eventId);

}
