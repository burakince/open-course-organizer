package tr.org.linux.opencourseorganizer.client.ui.component;

import com.google.gwt.user.client.ui.SimplePanel;

public class ProgressBar extends SimplePanel {

	private int m_value = 0;

	public ProgressBar(String id) {
		getElement().setId(id);
	}

	@Override
	public void onAttach() {
		super.onAttach();
		addProgressBarJS(getElement().getId(), m_value);
	}

	public int getValue() {
		return m_value;
	}

	public void setValue(int value) {
		m_value = value;
		setValueJS(getElement().getId(), m_value);
	}

	private static native void setValueJS(String id, int barValue) /*-{
		$wnd.$('#' + id).progressbar('destroy');
		$wnd.$('#' + id).progressbar({
			value : barValue
		});
	}-*/;

	private static native void addProgressBarJS(String id, int barValue) /*-{
		$wnd.$("#" + id).progressbar({
			value : barValue
		});
	}-*/;

}
