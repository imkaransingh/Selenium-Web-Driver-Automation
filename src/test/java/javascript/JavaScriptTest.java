package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest{
    @Test
    public void testScrollToTable(){
        homePage.clcikLargeAndDeepDom().scrollToTable();
    }
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clcikInfiniteScroll().scrollToParagraph(5);
    }
}
