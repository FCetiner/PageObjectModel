package tests.day20_2;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P06_WriteExcell {

    @Test
    public void test01() throws IOException {
        //ulkeler excelie 5. sutun olarak Nufus sutunu ekleyelim
        //3. satirdaki ulkenin nufusunu 1000000 yapalim
        String path="src/test/java/recources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        workbook.getSheet("Sayfa1").getRow(2).createCell(6).setCellValue("Haci");
        workbook.getSheet("Sayfa1").getRow(3).createCell(6).setCellValue("Naber");

        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);
    }
}
