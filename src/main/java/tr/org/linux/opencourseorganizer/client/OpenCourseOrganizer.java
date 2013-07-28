package tr.org.linux.opencourseorganizer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class OpenCourseOrganizer implements EntryPoint {

	@Override
	public void onModuleLoad() {
		final ClientFactory clientFactory = GWT.create(ClientFactory.class);
		clientFactory.getApp().run(RootLayoutPanel.get());
	}

}
