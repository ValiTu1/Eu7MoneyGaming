package cybertek.pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationPage{

    public RegistrationPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "title")
    public WebElement title;

    @FindBy(id = "forename")
    public WebElement firstname;

    @FindBy(xpath = "//input[@name='map(lastName)']")
    public WebElement surname;

    @FindBy(xpath = "//fieldset[@class='underlay']/input[@id='checkbox']")
    public List<WebElement> checkbox;

    @FindBy(id = "form")
    public WebElement joinnowBtn;

    @FindBy(xpath = "(//label[.='This field is required'])[4]")
    public WebElement requiredField;





}
