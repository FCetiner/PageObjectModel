package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_WebTables {
    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;

    @Test
    public void loginT(){
        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

    }

    @Test(dependsOnMethods = "loginT")
    public void table(){
        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        //header kısmında 1. satir ve altindaki datalari locate edelim
        //thead//tr[1]//th
        hmcWebTablePage=new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("tablodaki sutun sayisi : " + headerDataList.size());
        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        // //tbody
        System.out.println(hmcWebTablePage.tumBodyWebElementi.getText());

        //eger bodyi tek bir webelement olarak locate edersek icindeki tum datalari
        //get text ile yazdirabiliriz
        //ancak bu durumda bu elementler ayri ayri degil bodynin icindeki tek bir stringin
        //parcalari olurlar.Dolayisi ile bu elementlere tek tek ulasmamiz mumkun olmaz
        //sadece contains methodu ile body de olup olmadiklarini test edebiliriz

        //eger herbir dtayi ayri ayri almak istersek
        // //tbody//td seklinde locate edip bir liste atabiliriz

        List<WebElement> bodyTumDataList=hmcWebTablePage.tumBodyDatalarList;
        System.out.println("bodyTumDataList sayisi = " + bodyTumDataList.size());

    }

    @Test(dependsOnMethods = "loginT")
    public void printRows(){
        //printRows( ) metodu oluşturun //tr
        //table body’sinde bulunan toplam satir(row) sayısını bulun.
       hmcWebTablePage=new HMCWebTablePage();
        System.out.println(hmcWebTablePage.satirlariListesi.size());
        //Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        List<WebElement> satirlarWebElementList=hmcWebTablePage.satirlariListesi;
        for (WebElement each: satirlarWebElementList){
            System.out.println(each.getText());
        }
        // 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println("4. satir : "+satirlarWebElementList.get(3).getText());


    }
}
