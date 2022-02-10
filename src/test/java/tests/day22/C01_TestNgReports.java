package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNgReports extends TestBaseRapor {

    @Test
    public void windowHandlereusableTest() throws IOException {
        extentTest= extentReports.createTest("window handle","title ile ikinci sayfaya gecis yapildigi test edildi");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("Herokuapp sayfasina gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("Yeni window linkine tiklandi");
        ReusableMethods.switchToWindow("New Window");
        extentTest.info("reusable method kullanarak acilan 2. sayfaya geçildi");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("Title in beklenen deger ile ayni oldugu test edildi");
        ReusableMethods.getScreenshot("WindowSwitch");
        Driver.closeDriver();
    }






}
