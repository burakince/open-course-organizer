package tr.org.linux.opencourseorganizer.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class Events extends Place {

	public static class Tokenizer implements PlaceTokenizer<Events> {

		public String getToken(final Events place) {
			return place.getToken();
		}

		public Events getPlace(final String token) {
			return new Events(token);
		}
	}

	private String token;

	public Events(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}
