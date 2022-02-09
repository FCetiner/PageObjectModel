package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    //Driver class sayesinde eski driver died
    //artık driver ihtiyac varsa Driver.getDriver() yazacagiz

    @Test(groups = "miniRegression, smoke")
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //amazona gittigimizi test edelim
        String actualTitle=Driver.getDriver().getTitle();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        //driver.getDriver methodu her calistiginda
        //driver=new ChromeDriver() komutundan dolayi yeni bir driver olsuturuyor
        //Biz driver classindan getDriver i ilk calistirdigimizda new atamasi olsun
        //sonraki calismalarda atama olmasin istiyoruz
        //bunun icin driver=new ChromeDriver() bu satiri if blogu icerisine alacagiz
    Driver.closeDriver();
    }

    @Test(groups = "regression")
    public void test02(){
        //bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");
        //bestbuya gittigimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("best"));
        Driver.closeDriver();
    }
}
