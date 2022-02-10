package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {
    public TutorialPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Phones & PDAs" )
    public WebElement phonesPDA;

    @FindBy(tagName = "h4")
    public List<WebElement> products;









}
