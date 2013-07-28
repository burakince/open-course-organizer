package tr.org.linux.opencourseorganizer.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class HomePlace extends Place {

	public static class Tokenizer implements PlaceTokenizer<HomePlace> {

		public String getToken(final HomePlace place) {
			return place.getToken();
		}

		public HomePlace getPlace(final String token) {
			return new HomePlace(token);
		}

	}

	private String token;

	public HomePlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
