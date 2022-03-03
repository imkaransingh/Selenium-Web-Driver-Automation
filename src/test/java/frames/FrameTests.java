package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {
    @Test
    public void WysiwygEditor(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello";
        String text2 = "World";

        editorPage.setTextArea(text1);
        System.out.println("text 1 Entered");
        editorPage.clickIndentButton();
        System.out.println("clickIndentButton function is clicked");
        editorPage.setTextArea(text2);
        System.out.println("text 2 Entered");
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text in frame is Incorrect");
    }
}
