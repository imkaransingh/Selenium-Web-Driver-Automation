package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clcikJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "The result is incorrect");

    }
    @Test
    public void testGetTextFromAlert(){
        AlertPage alertsPage = homePage.clcikJavaScriptAlerts();
        alertsPage.triggerAlert();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Alert", "Alert text is incorrect");
    }
    @Test
    public void testSetInputInAlert(){
        AlertPage alertsPage = homePage.clcikJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = " TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
       assertEquals(alertsPage.getResult(), "You entered:" + text, "Results text incorrect");
    }
}
