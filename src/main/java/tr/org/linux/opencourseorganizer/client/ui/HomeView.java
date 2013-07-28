package tr.org.linux.opencourseorganizer.client.ui;

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

public class HomeView extends Composite implements HasText, Home {

	@UiTemplate("HomeView.ui.xml")
	interface HomeViewUiBinder extends UiBinder<Widget, HomeView> {}

	private static HomeViewUiBinder uiBinder = GWT.create(HomeViewUiBinder.class);

	private Presenter presenter;
	@UiField Button button;

	public HomeView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
