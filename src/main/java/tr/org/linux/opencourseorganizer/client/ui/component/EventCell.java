package tr.org.linux.opencourseorganizer.client.ui.component;

import tr.org.linux.opencourseorganizer.shared.EventProxy;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.ui.AbstractImagePrototype;

public class EventCell extends AbstractCell<EventProxy> {

	private final String imageHtml;

	public EventCell(final ImageResource image) {
		this.imageHtml = AbstractImagePrototype.create(image).getHTML();
	}

	@Override
	public void render(Context context, EventProxy value, SafeHtmlBuilder sb) {
		if (value == null)
			return;

		sb.appendHtmlConstant("<table>");

		sb.appendHtmlConstant("<tr><td rowspan='3'>");
		sb.appendHtmlConstant(imageHtml);
		sb.appendHtmlConstant("</td><td style='font-size:20px;'>");
		sb.appendEscaped(value.getName());
		sb.appendHtmlConstant("</td><td>");
		sb.appendEscaped("17-31 Ağustos 2013");
		sb.appendHtmlConstant("</td></tr><tr><td>");
		sb.appendEscaped(value.getLocation());
		sb.appendHtmlConstant("</td><td>");
		sb.appendEscaped("Kaydol");
		sb.appendHtmlConstant("</td></tr></table>");
	}

}
