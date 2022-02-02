package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement passwordBox;

    @FindBy(name="login")
    public WebElement loginButonu;

    @FindBy(className = "_9ay7")
    public WebElement girilemediYazisiElementi;

    @FindBy(xpath = "//div[@class='_9kq2']")
    public WebElement girdiginizHesapBulunamadiElementi;


    public void bekle(int saniye) throws InterruptedException {
        Thread.sleep(saniye*1000);
    }





}
