package tr.org.linux.opencourseorganizer.shared;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface AppRequestFactory extends RequestFactory {

	EventRequest eventRequest();

}
