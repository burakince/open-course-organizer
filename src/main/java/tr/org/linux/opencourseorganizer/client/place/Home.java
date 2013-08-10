package tr.org.linux.opencourseorganizer.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class Home extends Place {

	public static class Tokenizer implements PlaceTokenizer<Home> {

		public String getToken(final Home place) {
			return place.getToken();
		}

		public Home getPlace(final String token) {
			return new Home(token);
		}
	}

	private String token;

	public Home(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
