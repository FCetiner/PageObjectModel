package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegatifLogin {
    //2) Bir test method olustur NegativeLoginTest()
    @Test
    public void negatifLoginTesti(){
        //         https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com");
        //        login butonuna bas
        HotelMyCampPage hotelMyCamp=new HotelMyCampPage();
        hotelMyCamp.ilkLoginLinki.click();
        //    test data username: manager1 ,
        hotelMyCamp.userNameBox.sendKeys("manager1");
        //    test data password : manager1!
        hotelMyCamp.passwordBox.sendKeys("manager1!");
        hotelMyCamp.loginButonu.click();
        //    Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());

        Driver.closeDriver();
    }
}
