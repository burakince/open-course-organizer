package tr.org.linux.opencourseorganizer.client.ui.desktop;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;
import tr.org.linux.opencourseorganizer.client.ui.ShellDisplay;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ShellView extends Composite implements ShellDisplay {

	@UiTemplate("DesktopShell.ui.xml")
	interface DesktopShellUiBinder extends UiBinder<Widget, ShellView> {}

	private static DesktopShellUiBinder uiBinder = GWT.create(DesktopShellUiBinder.class);

	@SuppressWarnings("unused")
	private final Messages messages;
	@SuppressWarnings("unused")
	private final Constants constants;
	@SuppressWarnings("unused")
	private ShellDisplay.Presenter presenter;

	@UiField DockLayoutPanel dockLayoutPanel;
	@UiField SimplePanel container;

	@Inject
	public ShellView(final Messages messages, final Constants constants) {
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
	public void setWidget(IsWidget w) {
		container.clear();
		container.add(w);
	}

	private void initialize() {
		// TODO Auto-generated method stub
		
	}

}
