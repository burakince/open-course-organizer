package tr.org.linux.opencourseorganizer.client.activity;

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public abstract class AbstractActivity extends com.google.gwt.activity.shared.AbstractActivity {

	public abstract void start(AcceptsOneWidget panel, EventBus eventBus);

	@Override
	public final void start(AcceptsOneWidget panel, com.google.gwt.event.shared.EventBus eventBus) {
		start(panel, (com.google.web.bindery.event.shared.EventBus) eventBus);
	}

}
