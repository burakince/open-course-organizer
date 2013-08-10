package tr.org.linux.opencourseorganizer.client.place;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers(
		{
			Home.Tokenizer.class,
			Events.Tokenizer.class
		})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {}