package tests.day20_2;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadExcell {

    @Test
    public void test01() throws IOException {

        String path="src/test/java/recources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);
        System.out.println(workbook.getSheet("Sayfa1").getRow(1).getCell(2));


    }

}
