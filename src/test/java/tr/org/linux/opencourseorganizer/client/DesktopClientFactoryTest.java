package tr.org.linux.opencourseorganizer.client;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import tr.org.linux.opencourseorganizer.client.app.App;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwtmockito.GwtMock;
import com.google.gwtmockito.GwtMockitoTestRunner;
import com.google.web.bindery.event.shared.EventBus;

@RunWith(GwtMockitoTestRunner.class)
public class DesktopClientFactoryTest {

	@GwtMock App app;
	@GwtMock EventBus eventBus;
	@GwtMock PlaceController placeController;

	private ClientFactory clientFactory;

	@Before
	public void setUp() throws Exception {
		clientFactory = GWT.create(ClientFactory.class);
	}

	@Test
	public void clientFactoryAppShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getApp());
	}

	@Test
	public void clientFactoryEventBusShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getEventBus());
	}

	@Test
	public void clientFactoryPlaceControllerShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getPlaceController());
	}

}
