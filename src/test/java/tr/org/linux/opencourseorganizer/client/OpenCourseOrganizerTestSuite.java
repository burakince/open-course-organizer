package tr.org.linux.opencourseorganizer.client;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tr.org.linux.opencourseorganizer.client.application.DesktopAppTest;

@RunWith(Suite.class)
@SuiteClasses({
	OpenCourseOrganizerTest.class,
	DesktopClientFactoryTest.class,
	DesktopAppTest.class,
	MobileClientFactoryTest.class
	})
public class OpenCourseOrganizerTestSuite {}