package tests.day20;

import org.apache.poi.ss.usermodel.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {
        String path="src/test/java/recources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        //fis ile okudugumuz excel dosyasini projemiz icerisinde kullanabilmek icin
       // Apachi POI dependency yardimi ile bir workbook olusturduk

                //Bu workbook bizim projemizin icerisinde ulkeler excelinin bir kopyasini kullanmamizi sagliyor

        //Excellin yapisi geregi bir hucreye ulasabilmek icin workbooktan baslayarak
                //siresiyla shhet,row ve cell objeleri olusturmamiz gerekiyor

        Workbook workbook= WorkbookFactory.create(fis);

        Sheet sheet=workbook.getSheet("Sayfa1");
        Row row=sheet.getRow(4);
        Cell cell=row.getCell(2);
        System.out.println(cell);

        //indexi 4 olan satirdaki, indexi 2 olan hucrenin Andorra oldugunu test ediniz

        String expectedData="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);
        //cell hucresini yazdirabiliyoruz fakat stringe cevirmeden eslestirmede hata verir

        // 5. indexteki satirin, 3. indexdeki hucre bilgisini yazin
        row=sheet.getRow(5);
        cell=row.getCell(3);
        System.out.println(cell);

    }


}
