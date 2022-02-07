package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Map;

public class C05_ExceliMapeYukleme {

    @Test
    public void test01(){
        //dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kaydeden
        //reusable bir method olusturalim
        String path="src/test/java/recources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";
        Map<String,String> ulkelerMap=ReusableMethods.mapOlustur(path, sayfaAdi);

        //olusturdugumuz mapi kullanarak Turkey'in bilgilerini yazdirim
        System.out.println(ulkelerMap.get("Turkey"));

       // Listede Netherland olugunu test edin
        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));
    }
}
