package tests.day00_practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P01_DemoGuruTest {

    /*
http://demo.guru99.com/test/drag_drop.html url e git
DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
Perfect butonun goruntulendigini dogrulayin
 */

    //● Exact Text Belirli bir text) ile element bulma:
    //○ //tagname[.='text name'] Belirli bir tagname , herhangi bir attribute, belirli bir text
    //○ //*[.='text name'] Herhangi bir tag, belirli bir text.
    //○ //*[(text()='exact text with extra space and all')] Herhangi bir tag, belirli bir text
    //● Belirli bir metni içeren bir öğeyi bulmak için şunları kullanabiliriz:
    //○ //*[contains(text(),'piece of text')]

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("DemoGuruUrl"));

        Actions actions=new Actions(Driver.getDriver());

        DemoGuruPage demoGuruPage=new DemoGuruPage();

        actions.dragAndDrop(demoGuruPage.bankButonu,demoGuruPage.debitsideAccount)
        .dragAndDrop(demoGuruPage.salesButonu,demoGuruPage.creditSideAccount)
        .dragAndDrop(demoGuruPage.firstNumBesbinButonu,demoGuruPage.debitsideAmount)
                .dragAndDrop(demoGuruPage.secondNumBesbinButonu,demoGuruPage.creditSideAmount)
                .sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(demoGuruPage.perfectYazisiElementi.isDisplayed());
    }









}
