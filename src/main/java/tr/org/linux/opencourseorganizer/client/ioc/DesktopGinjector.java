package tr.org.linux.opencourseorganizer.client.ioc;

import tr.org.linux.opencourseorganizer.client.ClientFactory;

import com.google.gwt.inject.client.GinModules;

@GinModules(value = { DesktopGinModule.class })
public interface DesktopGinjector extends ClientFactory {}