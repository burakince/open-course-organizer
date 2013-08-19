package tr.org.linux.opencourseorganizer.client;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.gwtmockito.GwtMockitoTestRunner;

@RunWith(GwtMockitoTestRunner.class)
public class DesktopClientFactoryTest {

	private DesktopClientFactory clientFactory;

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

	@Test
	public void clientFactoryPlaceControllerShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getPlaceController());
	}

	@Test
	public void clientFactoryActivityMapperShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getActivityMapper());
	}

	@Test
	public void clientFactoryPlaceHistoryMapperShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getPlaceHistoryMapper());
	}

	@Test
	public void clientFactoryRequestFactoryShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getRequestFactory());
	}

	@Test
	public void clientFactoryEventsPresenterShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getEventsPresenter());
	}

	@Test
	public void clientFactoryEventDetailPresenterShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getEventDetailPresenter());
	}

	@Test
	public void clientFactorySubjectPresenterShouldNotBeNull() throws Exception {
		assertNotNull(clientFactory.getSubjectPresenter());
	}

}
