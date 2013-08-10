package tr.org.linux.opencourseorganizer.client.ui.desktop;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class EventView extends Composite implements EventsDisplay {

	@UiTemplate("EventView.ui.xml")
	interface EventViewUiBinder extends UiBinder<Widget, EventView> {}

	private static EventViewUiBinder uiBinder = GWT.create(EventViewUiBinder.class);

	@SuppressWarnings("unused")
	private Presenter presenter;
	@SuppressWarnings("unused")
	private final Messages messages;
	@SuppressWarnings("unused")
	private final Constants constants;

	public EventView(final Messages messages, final Constants constants) {
		this.messages = messages;
		this.constants = constants;
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	private void initialize() {
		// TODO Auto-generated method stub
		
	}

}
