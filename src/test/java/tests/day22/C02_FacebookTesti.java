package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_FacebookTesti extends TestBaseRapor {
    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("facebook","fake isimle girilemedigi test edildi");
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        extentTest.info("facebook sayfasina gidildi");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        FacebookPage facebookPage=new FacebookPage();

        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordBox.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();
        //4- Basarili giris yapilamadigini test edin
        extentTest.info("ilgili alanlar faker ile dolduruldu");
        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());
        extentTest.pass("girilemedigi test edildi");

    }
}
