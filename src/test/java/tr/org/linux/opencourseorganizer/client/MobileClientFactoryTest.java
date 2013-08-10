package tr.org.linux.opencourseorganizer.client;

import org.junit.Before;
import org.junit.Test;

import tr.org.linux.opencourseorganizer.client.exception.UnsupportedClientException;

public class MobileClientFactoryTest {

	private MobileClientFactory clientFactory;

	@Before
	public void setUp() throws Exception {
		clientFactory = new MobileClientFactory();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryAppShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getApp();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryEventBusShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getEventBus();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryPlaceControllerShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getPlaceController();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryActivityMapperShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getActivityMapper();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryPlaceHistoryMapperShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getPlaceHistoryMapper();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryHomePresenterShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getHomePresenter();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryEventsPresenterShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getEventsPresenter();
	}

}
