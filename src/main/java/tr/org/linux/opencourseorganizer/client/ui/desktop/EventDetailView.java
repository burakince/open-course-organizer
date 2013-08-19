package tr.org.linux.opencourseorganizer.client.ui.desktop;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;
import tr.org.linux.opencourseorganizer.client.ui.EventDetailDisplay;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory.EventRequest;

public class EventDetailView extends Composite implements EventDetailDisplay {

	@UiTemplate("EventDetailView.ui.xml")
	interface EventDetailViewUiBinder extends UiBinder<Widget, EventDetailView> {}

	private static EventDetailViewUiBinder uiBinder = GWT.create(EventDetailViewUiBinder.class);

	private Presenter presenter;
	@SuppressWarnings("unused")
	private final Messages messages;
	private final Constants constants;

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
	public void loadEvent(EventRequest request, Long eventId) {
		// TODO Auto-generated method stub

	}

	private void initialize() {
		// TODO Auto-generated method stub
		
	}

}
