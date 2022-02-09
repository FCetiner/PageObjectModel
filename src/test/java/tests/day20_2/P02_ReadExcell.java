package tests.day20_2;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class P02_ReadExcell {

    @Test
    public void test01() throws IOException {
        //ulkeler excelinin 3. satirini yazdirin
        String path="src/test/java/recources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        for(int i=0;i<4;i++){
            System.out.println(workbook.getSheet("Sayfa1").getRow(2).getCell(i).toString());
        }


    }
}
