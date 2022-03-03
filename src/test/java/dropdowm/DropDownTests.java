package dropdowm;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectOption(){
       DropdownPage dropDownPage =  homePage.clickDropDown();
       String optiom = "Option 1";
       dropDownPage.selectFromDropDown(optiom);
       var selectedOptions = dropDownPage.getSelectedOptions();
       assertEquals(selectedOptions.size(), 1, "Incorrect");
       assertTrue(selectedOptions.contains(optiom), "Option is selected");
    }
}
