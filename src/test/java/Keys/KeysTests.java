package Keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class KeysTests extends BaseTest {
    @Test
    public void testBackspace(){
        var keyPage = homePage.clcikKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }
    @Test
    public void testPi(){
        var keyPage = homePage.clcikKeyPresses();
        keyPage.enterPi();
    }
}
