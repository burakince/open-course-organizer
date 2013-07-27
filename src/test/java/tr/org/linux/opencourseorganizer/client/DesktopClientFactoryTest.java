package tr.org.linux.opencourseorganizer.client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DesktopClientFactoryTest {

	private ClientFactory clientFactory;

	@Before
	public void setUp() throws Exception {
		clientFactory = new DesktopClientFactory();
	}

	@Test
	public void clientFactoryAppShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getApp());
	}

	@Test
	public void clientFactoryEventBusShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getEventBus());
	}

}
