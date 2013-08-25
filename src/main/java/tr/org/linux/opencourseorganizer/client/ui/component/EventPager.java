package tr.org.linux.opencourseorganizer.client.ui.component;

import com.google.gwt.dom.client.Style.Overflow;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.user.cellview.client.AbstractPager;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.HasRows;
import com.google.web.bindery.event.shared.HandlerRegistration;

public class EventPager extends AbstractPager {

	private static final int DEFAULT_INCREMENT = 5;

	private int incrementSize = DEFAULT_INCREMENT;
	private int lastScrollPos = 0;

	private final ScrollPanel scrollable = new ScrollPanel();

	public EventPager() {
		initWidget(scrollable);
		scrollable.getElement().setTabIndex(-1);
		setHideScrollBar(true);

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

		this.addMouseOverHandler(new MouseOverHandler() {

			@Override
			public void onMouseOver(MouseOverEvent event) {
				setHideScrollBar(false);
			}
		});

		this.addMouseOutHandler(new MouseOutHandler() {

			@Override
			public void onMouseOut(MouseOutEvent event) {
				setHideScrollBar(true);
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

	private HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		return addDomHandler(handler, MouseOverEvent.getType());
	}

	private HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		return addDomHandler(handler, MouseOutEvent.getType());
	}

	private void setHideScrollBar(boolean value) {
		scrollable.getElement().getStyle().setOverflow(value ? Overflow.HIDDEN : Overflow.AUTO);
	}

}
