package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {

    //1) com.techproed altinda bir package olustur : smoketest
    //2) Bir Class olustur : PositiveTest
    //3) Bir test method olustur positiveLoginTest()

    @Test
    public void positiveLoginTest(){
        //         https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //        login butonuna bas
        HotelMyCampPage hotelMyCamp=new HotelMyCampPage();
        hotelMyCamp.ilkLoginLinki.click();
        //test data username: manager ,
        hotelMyCamp.userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        //test data password : Manager1!
        hotelMyCamp.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCamp.loginButonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCamp.basariliGirisYaziElementi.isDisplayed());

        Driver.closeDriver();
    }

}
