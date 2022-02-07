package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {

    @Test
    public void test01() throws IOException {
        //ulkeler excelie 5. sutun olarak Nufus sutunu ekleyelim
        //3. satirdaki ulkenin nufusunu 1000000 yapalim

        //1. dosyaya ulasalim
        String path="src/test/java/recources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        //2 class'da calismak icin doyanin kopyasi olan workbook olusturalim

        //ilk satirin 5. hucresine Nufus basligini yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");

        //3. satirdaki ulkenin nufusunu 1000000 yapalim
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");


        //4 kopyada yaptigimiz degisiklikleri ana dosyaya kadedelim
        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);

    }
}
