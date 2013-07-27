package tr.org.linux.opencourseorganizer.client;

public class DesktopClientFactory implements ClientFactory {

	@Override
	public App getApp() {
		return new App();
	}

}
