package tr.org.linux.opencourseorganizer.client;

import tr.org.linux.opencourseorganizer.shared.FieldVerifier;
import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class GwtTestOpenCourseOrganizer extends GWTTestCase {

  public String getModuleName() {
    return "tr.org.linux.opencourseorganizer.OpenCourseOrganizerJUnit";
  }

  public void testFieldVerifier() {
    assertFalse(FieldVerifier.isValidName(null));
    assertFalse(FieldVerifier.isValidName(""));
    assertFalse(FieldVerifier.isValidName("a"));
    assertFalse(FieldVerifier.isValidName("ab"));
    assertFalse(FieldVerifier.isValidName("abc"));
    assertTrue(FieldVerifier.isValidName("abcd"));
  }

  public void testGreetingService() {
    GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
    ServiceDefTarget target = (ServiceDefTarget) greetingService;
    target.setServiceEntryPoint(GWT.getModuleBaseURL() + "OpenCourseOrganizer/greet");

    delayTestFinish(10000);

    greetingService.greetServer("GWT User", new AsyncCallback<String>() {
      public void onFailure(Throwable caught) {
        fail("Request failure: " + caught.getMessage());
      }

      public void onSuccess(String result) {
        assertTrue(result.startsWith("Hello, GWT User!"));

        finishTest();
      }
    });
  }


}
