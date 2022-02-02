package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {

    //POM'de farkli classlara farkli sekilde ulasilmasi benimsenmistir
    //Driver class'i icin static yontemi kullaniyoruz
    //Page classlari icin ise obje uzerinden kullanilmasi tercih edilmistir

    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna nutella yazip aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        //arama sonuclarinin nutella icerdigini test edelim
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("nutella"));

        Driver.closeDriver();

    }

    @Test
    public void test02(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //Java icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);
        //sonucun java icerdigini test edelim
        String sonucYazisiSTr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiSTr.contains("Java"));
    }


}
