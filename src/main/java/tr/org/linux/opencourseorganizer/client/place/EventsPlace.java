package tr.org.linux.opencourseorganizer.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class EventsPlace extends Place {

	@Prefix(value = "event")
	public static class Tokenizer implements PlaceTokenizer<EventsPlace> {

		public String getToken(final EventsPlace place) {
			return place.getToken();
		}

		public EventsPlace getPlace(final String token) {
			return new EventsPlace(token);
		}
	}

	private String token;

	public EventsPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}
