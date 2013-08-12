package tr.org.linux.opencourseorganizer.client.ioc;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;
import tr.org.linux.opencourseorganizer.client.activity.AppActivityMapper;
import tr.org.linux.opencourseorganizer.client.application.App;
import tr.org.linux.opencourseorganizer.client.application.DesktopApp;
import tr.org.linux.opencourseorganizer.client.place.AppPlaceHistoryMapper;
import tr.org.linux.opencourseorganizer.client.presenter.desktop.ShellPresenter;
import tr.org.linux.opencourseorganizer.client.presenter.desktop.EventsPresenter;
import tr.org.linux.opencourseorganizer.client.presenter.desktop.SubjectPresenter;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.client.ui.SubjectDisplay;
import tr.org.linux.opencourseorganizer.client.ui.ShellDisplay;
import tr.org.linux.opencourseorganizer.client.ui.desktop.ShellView;
import tr.org.linux.opencourseorganizer.client.ui.desktop.EventsView;
import tr.org.linux.opencourseorganizer.client.ui.desktop.SubjectView;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryMapper;

public class DesktopModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(App.class).to(DesktopApp.class).in(Singleton.class);
		bind(EventBus.class).to(SimpleEventBus.class).asEagerSingleton();
		bind(PlaceController.class).toProvider(PlaceControllerProvider.class).in(Singleton.class);
		bind(ActivityMapper.class).to(AppActivityMapper.class).in(Singleton.class);
		bind(PlaceHistoryMapper.class).to(AppPlaceHistoryMapper.class).in(Singleton.class);

		bind(Messages.class).in(Singleton.class);
		bind(Constants.class).in(Singleton.class);

		bind(ShellDisplay.class).to(ShellView.class).asEagerSingleton();
		bind(EventsDisplay.class).to(EventsView.class).asEagerSingleton();
		bind(SubjectDisplay.class).to(SubjectView.class).asEagerSingleton();

		bind(ShellDisplay.Presenter.class).to(ShellPresenter.class).in(Singleton.class);
		bind(EventsDisplay.Presenter.class).to(EventsPresenter.class);
		bind(SubjectDisplay.Presenter.class).to(SubjectPresenter.class);
	}

	static class PlaceControllerProvider implements Provider<PlaceController> {

		private final PlaceController placeController;

		@Inject
		public PlaceControllerProvider(final EventBus eventBus) {
			placeController = new PlaceController(eventBus);
		}

		public PlaceController get() {
			return placeController;
		}

	}

}
