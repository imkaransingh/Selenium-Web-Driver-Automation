package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {
    @Test
    public void testWaitUntilHidden(){
        var loadPage = homePage.clickDynamicLoading().clickExample1();
        loadPage.clickStart();
        assertEquals(loadPage.getLoadedText(), "Hello World!", "The retreived text in Incorrect");
    }

}
