package tr.org.linux.opencourseorganizer.client.application;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class DesktopApp implements App {

	@SuppressWarnings("unused")
	private final EventBus eventBus;
	@SuppressWarnings("unused")
	private final PlaceController placeController;

	@Inject
	public DesktopApp(EventBus eventBus, PlaceController placeController) {
		this.eventBus = eventBus;
		this.placeController = placeController;
	}

	@Override
	public void run(HasWidgets.ForIsWidget parentView) {
		// TODO Auto-generated method stub
		Label lanel = new Label("Hello World!");
		parentView.add(lanel);
	}

}
