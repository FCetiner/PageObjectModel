package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanimi {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //eger key olarak girdigimiz String configration.properties dosyasinda yoksa
        //ğrnegin HMCUrl yerine HMCurl yazdik:
        //configReader.getProperty() o key i bulamaz ve nullPointerException firlatir
    }
}
