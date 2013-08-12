package tr.org.linux.opencourseorganizer.client.ui.desktop;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;
import tr.org.linux.opencourseorganizer.client.ui.SubjectDisplay;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class SubjectView extends Composite implements SubjectDisplay {

	@UiTemplate("SubjectView.ui.xml")
	interface HomeViewUiBinder extends UiBinder<Widget, SubjectView> {}

	private static HomeViewUiBinder uiBinder = GWT.create(HomeViewUiBinder.class);

	private Presenter presenter;
	private final Messages messages;
	private final Constants constants;

	@UiField Button button;
	@UiField Button eventsButton;

	@Inject
	public SubjectView(final Messages messages, final Constants constants) {
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
	public void showAlert() {
		Window.alert(messages.salute());
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		showAlert();
	}

	@UiHandler("eventsButton")
	void onClickEventsButton(ClickEvent e) {
		presenter.goEventsView();
	}

	private void initialize() {
		button.setText(constants.test());
		eventsButton.setText(constants.event());
	}

}
