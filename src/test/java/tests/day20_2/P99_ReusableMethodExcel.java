package tests.day20_2;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class P99_ReusableMethodExcel {

    public Cell hucreGetir(String path, String sayfaIsmi, int satirIndex, int hucreIndex){

        Cell cell=null;
        try {
            FileInputStream fis=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fis);
        cell=    workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cell;
    }

    public static Map<String,String> mapOlustur(String path, String sayfaAdi) {
        Map<String, String> map = new HashMap<>();

        Workbook workbook = null;

        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int satirSayisi = workbook.getSheet(sayfaAdi).getLastRowNum();
        String key = "";
        String value = "";
        for (int i = 0; i < satirSayisi; i++) {
            key = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            value = workbook.getSheet(sayfaAdi).getRow(i).getCell(1) + ", " +
                    workbook.getSheet(sayfaAdi).getRow(i).getCell(2) + ", " +
                    workbook.getSheet(sayfaAdi).getRow(i).getCell(3).toString();
            map.put(key, value);
        }
            return map;

    }


}
