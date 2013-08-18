package tr.org.linux.opencourseorganizer.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class EventsPlace extends Place {

	@Prefix(value = "event")
	public static class Tokenizer implements PlaceTokenizer<EventsPlace> {

		public String getToken(final EventsPlace place) {
			return place.getEventId() != null ? place.getEventId().toString() : "";
		}

		public EventsPlace getPlace(String event) {
			if (isNull(event))
				new EventsPlace(0L);
			return new EventsPlace(new Long(event));
		}

		private boolean isNull(String event) {
			return event == null || event.equals("");
		}

	}

	private Long eventId;

	public EventsPlace(Long eventId) {
		this.eventId = eventId;
	}

	public Long getEventId() {
		return eventId;
	}

}
