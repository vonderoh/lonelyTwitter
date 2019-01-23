package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

/** Class for Testing LonelyTwitterActivity
 * @author wz
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    /** Constructor for the LonelyTwitterActivityTest class
     */
    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /** Starts the test
     * @throws Exception
     */
    public void testStart() throws Exception {
        Activity activity = getActivity();
    }
}