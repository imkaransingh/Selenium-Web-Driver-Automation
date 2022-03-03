package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        FileUploadPage uploadPage = homePage.clickFileUplad();
        uploadPage.uploadFile("C:\\Karan\\Karan_SWD_Practice\\Karan_SWD_Practice\\untitled\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded File failed");
    }
}
