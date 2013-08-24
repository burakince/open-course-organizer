package tr.org.linux.opencourseorganizer.client.provider;

import java.util.List;

import tr.org.linux.opencourseorganizer.shared.AppRequestFactory;
import tr.org.linux.opencourseorganizer.shared.AppRequestFactory.EventRequest;
import tr.org.linux.opencourseorganizer.shared.EventProxy;

import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class EventsDataProvider extends AsyncDataProvider<EventProxy> {

	private final AppRequestFactory factory;

	public EventsDataProvider(final AppRequestFactory factory) {
		this.factory = factory;
	}

	@Override
	protected void onRangeChanged(final HasData<EventProxy> display) {
		EventRequest request = factory.eventRequest();

		request.findAll().fire(new Receiver<List<EventProxy>>() {
			@Override
			public void onSuccess(List<EventProxy> response) {
				display.setRowData(0, response);
			}
		});
	}

}
