package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframe = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.xpath("//Button[@aria-label='Increase indent']");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void clickIndentButton(){
        driver.findElement(decreaseIndentButton).click();
    }
    public String getTextFromEditor(){
        switchToEditArea();
       String text = driver.findElement(textArea).getText();
       switchToMainArea();
       return text;
    }
    public void switchToEditArea(){
        driver.switchTo().frame(editorIframe);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
