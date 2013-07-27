package tr.org.linux.opencourseorganizer.client;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwtmockito.GwtMock;
import com.google.gwtmockito.GwtMockitoTestRunner;

@RunWith(GwtMockitoTestRunner.class)
public class OpenCourseOrganizerTest {

	@GwtMock ClientFactory clientFactory;
	@GwtMock App app;

	OpenCourseOrganizer openCourseOrganizer;

	@Before
	public void setUp() throws Exception {
		openCourseOrganizer = new OpenCourseOrganizer();
	}

	@Test
	public void onModuleLoadShouldGetApp() throws Exception {
		when(clientFactory.getApp()).thenReturn(app);
		openCourseOrganizer.onModuleLoad();
		verify(clientFactory).getApp();
	}

	@Test
	public void appShouldRunWithRootLayoutPanel() throws Exception {
		when(clientFactory.getApp()).thenReturn(app);
		openCourseOrganizer.onModuleLoad();
		verify(app).run(RootLayoutPanel.get());
	}

}
