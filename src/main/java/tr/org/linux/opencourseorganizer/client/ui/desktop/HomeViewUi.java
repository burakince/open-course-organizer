package tr.org.linux.opencourseorganizer.client.ui.desktop;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class HomeViewUi extends Composite implements HasText, HomeView {

	@UiTemplate("HomeView.ui.xml")
	interface HomeViewUiBinder extends UiBinder<Widget, HomeViewUi> {}

	private static HomeViewUiBinder uiBinder = GWT.create(HomeViewUiBinder.class);

	@SuppressWarnings("unused")
	private Presenter presenter;
	private Messages messages;
	private Constants constants;

	@UiField Button button;

	@Inject
	public HomeViewUi(Messages messages, Constants constants) {
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
		button.setText(constants.test());
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert(messages.salute());
	}

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}

}
