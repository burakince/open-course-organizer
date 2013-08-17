package tr.org.linux.opencourseorganizer.client.ui.desktop;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.shared.EventProxy;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;

public class EventsView extends Composite implements EventsDisplay {

	@UiTemplate("EventsView.ui.xml")
	interface EventViewUiBinder extends UiBinder<Widget, EventsView> {}

	private static EventViewUiBinder uiBinder = GWT.create(EventViewUiBinder.class);

	private Presenter presenter;
	private final Messages messages;
	private final Constants constants;

	@UiField Button subjectButton;
	@UiField Button eventButton;
	@UiField Label eventLabel;

	@Inject
	public EventsView(final Messages messages, final Constants constants) {
		this.messages = messages;
		this.constants = constants;
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@UiHandler("subjectButton")
	void onClickSubjectButton(ClickEvent e) {
		presenter.goSubjectView();
	}

	@UiHandler("eventButton")
	void onClickEventsButton(ClickEvent e) {
		presenter.findEvent();
	}

	@Override
	public void loadEvent(Request<EventProxy> request) {

		request.fire(new Receiver<EventProxy>() {

			@Override
			public void onSuccess(EventProxy response) {
				eventLabel.setText(response.getName());
			}

		});
	}

	private void initialize() {
		subjectButton.setText(constants.subject());
		eventButton.setText(constants.loadEvent());
		eventLabel.setText(messages.salute());
	}

}
