package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et

    //                - yanlisSifre
    //                - yanlisKulllanici
    //                - yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et
    HotelMyCampPage hotelMyCamp;


    @Test
    public void yanlisSifre(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCamp=new HotelMyCampPage();
        hotelMyCamp.bekle(5);
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        hotelMyCamp.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCamp.bekle(5);
        hotelMyCamp.loginButonu.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisKulllanici(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCamp=new HotelMyCampPage();
        hotelMyCamp.bekle(5);
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.userNameBox.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCamp.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCamp.bekle(5);
        hotelMyCamp.loginButonu.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisSifreKullanici(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCamp=new HotelMyCampPage();
        hotelMyCamp.bekle(5);
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.userNameBox.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCamp.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCamp.bekle(5);
        hotelMyCamp.loginButonu.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }



}
