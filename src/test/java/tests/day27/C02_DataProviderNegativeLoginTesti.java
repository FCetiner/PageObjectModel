package tests.day27;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProviderNegativeLoginTesti {


    @DataProvider
    public static Object[][] wrongUserList() {
        String liste[][]={{"manager11","manager11"},{"manager12","manager12"},{"manager13","manager13"}};
        return  liste;
    }

    @Test(dataProvider = "wrongUserList")
    public void yanlisSifreKullanici(String wrongUserName, String wrongPassword){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCamp=new HotelMyCampPage();
        hotelMyCamp.bekle(5);
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.userNameBox.sendKeys(wrongUserName);
        hotelMyCamp.passwordBox.sendKeys(wrongPassword);
        hotelMyCamp.bekle(5);
        hotelMyCamp.loginButonu.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

}
