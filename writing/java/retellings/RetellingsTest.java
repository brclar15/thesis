package retellings;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.concordion.integration.junit3.ConcordionTestCase;

/* Run this class as a JUnit test. */

public class RetellingsTest extends ConcordionTestCase {
    
    public String getPassageBegin(String urn) {
        return ("Never looked anything up for urn " + urn);
    }
}
