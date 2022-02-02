package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
public static WebDriver driver;


public static WebDriver getDriver(){
    WebDriverManager.chromedriver().setup();
    if(driver==null) {  //Bu if sayeside kod ccalisirken bir kere new keyword ile driver olusturunca
        driver = new ChromeDriver();    //diger kullanimlarda devreye girmeyecek
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    return driver;
}
public static void closeDriver(){
    if(driver!=null) {
        driver.quit();
        driver=null;        //bir sonraki kullanimda null degeri ile baslamasi icin null atadik
    }
}





}
