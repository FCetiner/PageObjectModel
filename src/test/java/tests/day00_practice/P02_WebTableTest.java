package tests.day00_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.WebTablePage;
import utilities.Driver;

public class P02_WebTableTest {
    /*
   go to url : https://en.wikipedia.org/wiki/Dell
   go to table which name is 'List of companies acquired by Dell Inc.'
   print row 4 of the table on console
   also print on console the 2nd and 3rd elements (middle 2 elements) in line 5
   ( 2nd and 3rd elements : November 2, Cloud integration leader)
    */

    @Test
    public void tableTest(){
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Dell");
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        WebTablePage webTablePage=new WebTablePage();
        jse.executeScript("arguments[0].scrollIntoView(true);", webTablePage.nameOfList);
        System.out.println("4. satir :"+webTablePage.fourthRow.getText());
        System.out.println("ikinci oge : " + webTablePage.secondElement.getText());
        System.out.println("ucuncuoge : "+webTablePage.thirdElement.getText());
        Driver.closeDriver();
    }
}
