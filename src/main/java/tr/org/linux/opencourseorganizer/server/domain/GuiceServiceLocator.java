package tr.org.linux.opencourseorganizer.server.domain;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import com.google.inject.Injector;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;
import com.google.web.bindery.requestfactory.shared.ServiceLocator;

public class GuiceServiceLocator implements ServiceLocator {

	@Override
	public Object getInstance(Class<?> clazz) {
		HttpServletRequest request = RequestFactoryServlet.getThreadLocalRequest();
		ServletContext servletContext = request.getSession().getServletContext();

		/*
		 * during the GuiceServletContextListener the Injector is sticked to the
		 * ServletContext with the attribute name Injector.class.getName()
		 */
		Injector injector = (Injector) servletContext.getAttribute(Injector.class.getName());

		if (injector == null) {
			throw new IllegalStateException(
					"No injector found. Must be set as attribute in the servlet context with the name "
							+ Injector.class.getName());
		}

		// Resolve Binding with Guice
		return injector.getInstance(clazz);
	}

}
