package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReusableMethodsExcel {
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

    public static Map<String,String> mapOlustur(String path, String sayfaAdi) {
        Map<String,String> excelMap=new HashMap();
        //sirali olmasini istiyorsak TreeMap yapabiliriz

        Workbook workbook = null;
        try {
        FileInputStream fis=new FileInputStream(path);
        workbook=WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int satirSayisi=workbook.getSheet(sayfaAdi).getLastRowNum();

        String key="";
        String value="";
        for(int i=0; i<=satirSayisi;i++){
            //ikinci adim tablodaki hucreleri mapa uygun hale donusturmek
            key=workbook.getSheet(sayfaAdi).getRow(i).getCell(0).toString();
            value=workbook.getSheet(sayfaAdi).getRow(i).getCell(1)+", "+
                    workbook.getSheet(sayfaAdi).getRow(i).getCell(2)+", "+
                    workbook.getSheet(sayfaAdi).getRow(i).getCell(3).toString();
            //key value haline getirdigimiiz satirlari mapa ekliyoruz
            excelMap.put(key,value);
        }

        return excelMap;

    }
}
