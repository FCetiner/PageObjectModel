package tests.day19;

import org.testng.annotations.Test;
import pages.DemoQAPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoQA {
    //Bir Class olusturun D19_WebtablesHomework
    @Test(groups = {"smoke","regression"})
    public void demoqaTest(){
         //  1. “https://demoqa.com/webtables” sayfasina gidin
         Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));
         //  2. Headers da bulunan department isimlerini yazdirin
         DemoQAPage demoQAPage=new DemoQAPage();
         System.out.println("baslik satiri elementi : "+demoQAPage.baslikSatiriElementi.getText());
         //ikinci yontem olarak basliklari bir listeye koyabiliriz

         // normalde thead//th olurdu ancak bu tablo class isimleri ile organize edilmis
         //  3. 3. sutunun basligini yazdirin
         System.out.println("3. sutun basligi : "+demoQAPage.basliklarWebElementiListesi.get(2).getText());
         //  4. Tablodaki tum datalari yazdirin
         System.out.println("===========Tum Body========");
         System.out.println(demoQAPage.bodyTekWebElement.getText());
         //  5. Tabloda kac cell (data) oldugunu yazdirin
         System.out.println("Tablodaki data sayisi : "+demoQAPage.tumDataWebElementList.size());
         //  6. Tablodaki satir sayisini yazdirin
         System.out.println(demoQAPage.tumSatirlarWebElementList.size());
         //  7. Tablodaki sutun sayisini yazdirin
         //farkli yollardan hesaplanabilir ama biz hucre sayisi bolu satir sayisi yapalim
         System.out.println("tablodaki sutun sayisi : " + (demoQAPage.tumSatirlarWebElementList.size() / demoQAPage.tumSatirlarWebElementList.size()));
         //  8. Tablodaki 3.kolonu yazdirin
         demoQAPage.sutunYazdir(3);
         //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
         demoQAPage.ismeGoreMaasYazdir("Kierra");
         //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
         demoQAPage.hucreYazdir(2,3);
         Driver.closeDriver();

     }




}
