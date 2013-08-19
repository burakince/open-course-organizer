package tr.org.linux.opencourseorganizer.client.ui.desktop;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;
import tr.org.linux.opencourseorganizer.client.ui.EventDetailDisplay;
import tr.org.linux.opencourseorganizer.shared.EventProxy;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class EventDetailView extends Composite implements EventDetailDisplay {

	@UiTemplate("EventDetailView.ui.xml")
	interface EventDetailViewUiBinder extends UiBinder<Widget, EventDetailView> {}

	private static EventDetailViewUiBinder uiBinder = GWT.create(EventDetailViewUiBinder.class);

	@SuppressWarnings("unused")
	private Presenter presenter;
	@SuppressWarnings("unused")
	private final Messages messages;
	private final Constants constants;

	@UiField Label nameLabel;
	@UiField Label eventName;
	@UiField Label locationLabel;
	@UiField Label eventLocation;

	@Inject
	public EventDetailView(final Messages messages, final Constants constants) {
		this.messages = messages;
		this.constants = constants;
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void loadEvent(EventProxy response) {
		eventName.setText(response.getName());
		eventLocation.setText(response.getLocation());
	}

	private void initialize() {
		nameLabel.setText(constants.eventName());
		locationLabel.setText(constants.eventLocation());
	}

}
