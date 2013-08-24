package tr.org.linux.opencourseorganizer.client.ui.desktop;

import tr.org.linux.opencourseorganizer.client.Constants;
import tr.org.linux.opencourseorganizer.client.Messages;
import tr.org.linux.opencourseorganizer.client.ui.EventsDisplay;
import tr.org.linux.opencourseorganizer.client.ui.component.EventCell;
import tr.org.linux.opencourseorganizer.client.ui.component.EventPager;
import tr.org.linux.opencourseorganizer.client.ui.resource.Resources;
import tr.org.linux.opencourseorganizer.shared.EventProxy;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy.KeyboardPagingPolicy;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;

public class EventsView extends Composite implements EventsDisplay {

	@UiTemplate("EventsView.ui.xml")
	interface EventViewUiBinder extends UiBinder<Widget, EventsView> {}

	private static EventViewUiBinder uiBinder = GWT.create(EventViewUiBinder.class);

	private Presenter presenter;
	@SuppressWarnings("unused")
	private final Messages messages;
	@SuppressWarnings("unused")
	private final Constants constants;

	@UiField EventPager eventPagerPanel;
	@UiField FlowPanel eventsPanel;

	private CellList<EventProxy> cellList;

	@Inject
	public EventsView(final Messages messages, final Constants constants) {
		this.messages = messages;
		this.constants = constants;
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public CellList<EventProxy> getCellList() {
		return cellList;
	}

	private void initialize() {
		Resources resources = GWT.create(Resources.class);
		EventCell eventCell = new EventCell(resources.tux());
		cellList = new CellList<EventProxy>(eventCell);
		cellList.setPageSize(10);
		cellList.setKeyboardPagingPolicy(KeyboardPagingPolicy.INCREASE_RANGE);
		cellList.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.BOUND_TO_SELECTION);

		final SingleSelectionModel<EventProxy> selectionModel = new SingleSelectionModel<EventProxy>();
		cellList.setSelectionModel(selectionModel);
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {

			@Override
			public void onSelectionChange(SelectionChangeEvent event) {
				presenter.goEventDetailView(selectionModel.getSelectedObject().getId());
			}
		});

		eventPagerPanel.setDisplay(cellList);
	}

}
