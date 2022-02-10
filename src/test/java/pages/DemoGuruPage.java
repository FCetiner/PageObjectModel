package pages;

import freemarker.cache.WebappTemplateLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuruPage {

    public DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[contains(text(), 'BANK')]")
        public WebElement bankButonu;

    @FindBy(xpath = "//a[contains(text(), 'SALES')]")
    public WebElement salesButonu;

    @FindBy(xpath = "(//a[contains(text(), ' 5000')])[1]")
    public WebElement firstNumBesbinButonu;

    @FindBy(xpath = "(//a[contains(text(), ' 5000')])[1]")
    public WebElement secondNumBesbinButonu;

    @FindBy(xpath = "(//li[@class=\"placeholder\"])[1]")
    public WebElement debitsideAccount;

    @FindBy(xpath = "(//li[@class=\"placeholder\"])[2]")
    public WebElement debitsideAmount;

    @FindBy(xpath = "(//li[@class=\"placeholder\"])[3]")
    public WebElement creditSideAccount;

    @FindBy(xpath = "(//li[@class=\"placeholder\"])[4]")
    public WebElement creditSideAmount;

    @FindBy(linkText ="perfect" )
    public WebElement  perfectYazisiElementi;










}
