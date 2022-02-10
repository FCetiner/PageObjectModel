package tests.day00_practice;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P03_TutorialTest {
    //~ url'ye gidin: "http://tutorialsninja.com/demo/index.php?route=common/home"
//~ Phones & PDAs e tıklayın
//~ telefonların marka adını al
//~ tüm elemanlar için ekle düğmesine tıklayın
//~ siyah toplam eklenen sepet düğmesine tıklayın
//~ listenin isimlerini sepetten al
//~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
//~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin
 @Test
    public void test(){
     Driver.getDriver().navigate().to(ConfigReader.getProperty("TutorialUrl"));

 }
}
