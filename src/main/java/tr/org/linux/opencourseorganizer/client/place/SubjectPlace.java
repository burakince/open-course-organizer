package tr.org.linux.opencourseorganizer.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class SubjectPlace extends Place {

	@Prefix(value = "subject")
	public static class Tokenizer implements PlaceTokenizer<SubjectPlace> {

		public String getToken(final SubjectPlace place) {
			return place.getSubjectId() != null ? place.getSubjectId().toString() : "";
		}

		public SubjectPlace getPlace(final String subject) {
			if (isNull(subject))
				new SubjectPlace(0L);
			return new SubjectPlace(new Long(subject));
		}

		private boolean isNull(final String event) {
			return event == null || event.equals("");
		}

	}

	private Long subjectId;

	public SubjectPlace(final Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

}
