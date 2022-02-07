package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReusableMethods {
    //bir method olusuralim
    //dosya yolu ve satir,sayfaIsmi, hucre indexini verince hucre bilgisini dondursun

    public static Cell hucreGetir(String path,String sayfaIsmi, int satirIndex, int hucreIndex){
        Cell cell = null;
        try {
            FileInputStream fis= new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fis);
            cell=workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return cell;
    }

}
