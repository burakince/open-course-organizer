package tr.org.linux.opencourseorganizer.client;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;

public class DesktopApp implements App {

	@Override
	public void run(HasWidgets.ForIsWidget parentView) {
		// TODO Auto-generated method stub
		Label lanel = new Label("Hello World!");
		parentView.add(lanel);
	}

}
