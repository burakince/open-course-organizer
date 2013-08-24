package tr.org.linux.opencourseorganizer.client.ui.component;

import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.user.cellview.client.AbstractPager;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.HasRows;

public class EventPager extends AbstractPager {

	private static final int DEFAULT_INCREMENT = 5;

	private int incrementSize = DEFAULT_INCREMENT;
	private int lastScrollPos = 0;

	private final ScrollPanel scrollable = new ScrollPanel();

	public EventPager() {
		initWidget(scrollable);
		scrollable.getElement().setTabIndex(-1);
		scrollable.addScrollHandler(new ScrollHandler() {

			@Override
			public void onScroll(ScrollEvent event) {
				int oldScrollPos = lastScrollPos;
				lastScrollPos = scrollable.getVerticalScrollPosition();

				if (oldScrollPos >= lastScrollPos) {
					return;
				}

				HasRows display = getDisplay();
				if (display == null) {
					return;
				}

				int maxScrollTop = scrollable.getWidget().getOffsetHeight() - scrollable.getOffsetHeight();
				if (lastScrollPos >= maxScrollTop) {
					int newPageSize = Math.min(display.getVisibleRange().getLength() + incrementSize, display.getRowCount());
					display.setVisibleRange(0, newPageSize);
				}
			}
		});
	}

	public int getIncrementSize() {
		return incrementSize;
	}

	public void setIncrementSize(int incrementSize) {
		this.incrementSize = incrementSize;
	}

	@Override
	public void setDisplay(HasRows display) {
		if (display instanceof Widget)
			scrollable.setWidget((Widget) display);

		super.setDisplay(display);
	}

	@Override
	protected void onRangeOrRowCountChanged() {
	}

}
