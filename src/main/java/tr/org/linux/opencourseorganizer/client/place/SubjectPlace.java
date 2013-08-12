package tr.org.linux.opencourseorganizer.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class SubjectPlace extends Place {

	@Prefix(value = "subject")
	public static class Tokenizer implements PlaceTokenizer<SubjectPlace> {

		public String getToken(final SubjectPlace place) {
			return place.getToken();
		}

		public SubjectPlace getPlace(final String token) {
			return new SubjectPlace(token);
		}
	}

	private String token;

	public SubjectPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
