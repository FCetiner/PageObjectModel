package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {
    //2) Bir test method olustur positiveLoginTest()
    @Test(groups = {"miniRegression", "smoke"})
    public void pozitifLoginTest(){
        //        https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //        login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        //    test data username: manager ,
        hotelMyCampPage.userNameBox.sendKeys("manager");
        //    test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hotelMyCampPage.loginButonu.sendKeys(Keys.ENTER);

        Driver.closeDriver();
    }
}
