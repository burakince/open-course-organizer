package tr.org.linux.opencourseorganizer.client.ioc;

import tr.org.linux.opencourseorganizer.client.activity.AppActivityMapper;
import tr.org.linux.opencourseorganizer.client.application.App;
import tr.org.linux.opencourseorganizer.client.application.DesktopApp;
import tr.org.linux.opencourseorganizer.client.place.AppPlaceHistoryMapper;
import tr.org.linux.opencourseorganizer.client.presenter.HomePresenter;
import tr.org.linux.opencourseorganizer.client.ui.HomeView;

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
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(PlaceController.class).toProvider(PlaceControllerProvider.class).in(Singleton.class);
		bind(ActivityMapper.class).to(AppActivityMapper.class).in(Singleton.class);
		bind(PlaceHistoryMapper.class).to(AppPlaceHistoryMapper.class).in(Singleton.class);
		bind(HomeView.Presenter.class).to(HomePresenter.class);
	}

	static class PlaceControllerProvider implements Provider<PlaceController> {

		private final PlaceController placeController;

		@Inject
		public PlaceControllerProvider(EventBus eventBus) {
			placeController = new PlaceController(eventBus);
		}

		public PlaceController get() {
			return placeController;
		}

	}

}
