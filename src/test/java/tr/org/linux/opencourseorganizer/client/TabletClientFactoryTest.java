package tr.org.linux.opencourseorganizer.client;

import org.junit.Before;
import org.junit.Test;

import tr.org.linux.opencourseorganizer.client.exception.UnsupportedClientException;

public class TabletClientFactoryTest {

	private TabletClientFactory clientFactory;

	@Before
	public void setUp() throws Exception {
		clientFactory = new TabletClientFactory();
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
	public void clientFactoryRequestFactoryShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getRequestFactory();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryEventsPresenterShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getEventsPresenter();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactoryEventDetailPresenterShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getEventDetailPresenter();
	}

	@Test(expected = UnsupportedClientException.class)
	public void clientFactorySubjectPresenterShouldThrowUnsupportedClientException() throws Exception {
		clientFactory.getSubjectPresenter();
	}

}
