package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    private void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication(){

        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HowersPage clickHovers(){
        clickLink("Hovers");
        return new HowersPage(driver);
    }
    public KeyPressPage clcikKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public AlertPage clcikJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }
    public FileUploadPage clickFileUplad(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clcikLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage clcikInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindiws(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
}
