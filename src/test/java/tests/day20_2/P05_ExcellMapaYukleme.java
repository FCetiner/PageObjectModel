package tests.day20_2;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class P05_ExcellMapaYukleme {

    @Test
    public void test01()  {
        //dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kaydeden
        //reusable bir method olusturalim
        String path="src/test/java/recources/ulkeler.xlsx";
        Map<String,String> ulkelerMap=P99_ReusableMethodExcel.mapOlustur(path,"Sayfa1");
        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));
    }
}
