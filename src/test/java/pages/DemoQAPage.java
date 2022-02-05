package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoQAPage {
   public DemoQAPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement baslikSatiriElementi;

   @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> basliklarWebElementiListesi;

   @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement bodyTekWebElement;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> tumDataWebElementList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tumSatirlarWebElementList;


    public void sutunYazdir(int sutun) {
        int satirSayisi=tumSatirlarWebElementList.size();
        String dinamikXpath="";
        WebElement geciciElement;
        System.out.println(basliklarWebElementiListesi.get(sutun-1).getText());
        for (int i=1;i<=satirSayisi;i++){
            dinamikXpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+sutun+"]";
            geciciElement=Driver.getDriver().findElement(By.xpath(dinamikXpath));
            System.out.println(geciciElement.getText());
        }
    }

    public void ismeGoreMaasYazdir(String isim) {
        int satirSayisi=tumSatirlarWebElementList.size();
        String dinamikXpath="";
        String satirdakiIsim;
        String salary;

        for(int i=1;i<satirSayisi;i++){
            dinamikXpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+1+"]";
            satirdakiIsim=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            dinamikXpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+5+"]";
            salary=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

            if(satirdakiIsim.contains(isim)){
                System.out.println(isim+" maasi : "+salary);
            }
        }
    }

    public void hucreYazdir(int satir, int sutun) {
        String dinamikXpath="((//div[@class='rt-tr-group'])["+satir+"]//div[@class='rt-td'])["+sutun+"]";
        System.out.println(Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText());
    }
}
