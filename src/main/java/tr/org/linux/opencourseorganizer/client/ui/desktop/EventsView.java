package tr.org.linux.opencourseorganizer.client.ui.desktop;

import java.util.List;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.shared.EventProxy;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class EventsView extends Composite implements EventsDisplay {

	@UiTemplate("EventsView.ui.xml")
	interface EventViewUiBinder extends UiBinder<Widget, EventsView> {}

	private static EventViewUiBinder uiBinder = GWT.create(EventViewUiBinder.class);

	private Presenter presenter;
	@SuppressWarnings("unused")
	private final Messages messages;
	@SuppressWarnings("unused")
	private final Constants constants;

	@UiField FlowPanel eventsPanel;

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

	@Override
	public void loadEvent(List<EventProxy> response) {
		eventsPanel.clear();

		for (final EventProxy event : response) {
			HorizontalPanel panel = new HorizontalPanel();

			Label label = new Label(event.getName());
			panel.add(label);

			Button button = new Button(" --> ");
			button.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent e) {
					presenter.goEventDetailView(event.getId());
				}
			});
			panel.add(button);

			eventsPanel.add(panel);
		}
	}

	private void initialize() {
	}

}
