package tr.org.linux.opencourseorganizer.client.ui.desktop;

import java.util.ArrayList;
import java.util.List;

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
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;

public class EventsView extends Composite implements EventsDisplay {

	@UiTemplate("EventsView.ui.xml")
	interface EventViewUiBinder extends UiBinder<Widget, EventsView> {}

	private static EventViewUiBinder uiBinder = GWT.create(EventViewUiBinder.class);

	private Presenter presenter;
	@SuppressWarnings("unused")
	private final Messages messages;
	private final Constants constants;

	@UiField Button subjectButton;
	@UiField VerticalPanel eventsPanel;

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
	void onClickEventsButton(ClickEvent e) {
		presenter.goSubjectView();
	}

	@Override
	public void setEvents(Request<List<EventProxy>> request) {
		final List<EventProxy> events = new ArrayList<EventProxy>();

		request.fire(new Receiver<List<EventProxy>>() {

			@Override
			public void onSuccess(List<EventProxy> response) {
				events.addAll(response);
			}
		});

		for (EventProxy event : events) {
			Label label = new Label();
			label.setText(event.getName());
			eventsPanel.add(label);
		}
	}

	private void initialize() {
		subjectButton.setText(constants.subject());
	}

}
