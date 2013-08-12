package tr.org.linux.opencourseorganizer.client.activity;

import tr.org.linux.opencourseorganizer.client.ClientFactory;
import tr.org.linux.opencourseorganizer.client.ui.SubjectDisplay;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class SubjectActivity extends AbstractActivity {

	private final ClientFactory clientFactory;

	@Inject
	public SubjectActivity(final ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		final SubjectDisplay.Presenter presenter = clientFactory.getSubjectPresenter();
		presenter.setEventBus(eventBus);
		presenter.go(panel);
	}

}
