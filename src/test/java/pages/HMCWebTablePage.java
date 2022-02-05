package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {

   public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;

   @FindBy(xpath = "//tbody")
    public WebElement tumBodyWebElementi;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalarList;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlariListesi;

    public WebElement satirGetir(int satirNo){
        //2. satiri yazdir //tbody//tr[2]
        //7 satiri yazdir //tbody//tr[7]
        String satirDinamikXpath="//tbody//tr["+satirNo+"]";
        WebElement satirElement=Driver.getDriver().findElement(By.xpath(satirDinamikXpath));
    return satirElement;
    }


    public String hucreWebElementGetir(int satir, int sutun) {
        //2. satirin 4. datasi //tbody//tr[2]//td[4]
        //4. satirin 5. datasi  //tbody//tr[4]//td[5]

        String satirDinamikXpath="//tbody//tr["+satir+"]//td["+sutun+"]";
        WebElement istenenHucreWebElement=Driver.getDriver().findElement(By.xpath(satirDinamikXpath));

        return istenenHucreWebElement.getText();
    }

    public void sutunYazdir(int sutun) {
       //herbir satirdaki istenen sutun elementini yazdirabilmek icin
        //once satir sayisini bilmeye ihtiyacim var
        int satirSayisi=satirlariListesi.size();

        for(int i=1;i<=satirSayisi;i++){
            System.out.println(hucreWebElementGetir(i, sutun));
        }
    }
}
