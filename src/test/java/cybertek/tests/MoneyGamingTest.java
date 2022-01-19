package cybertek.tests;

import cybertek.TestBase;
import cybertek.pages.RegistrationPage;
import cybertek.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoneyGamingTest extends TestBase {

    @Test
    public void task(){


        //clicking on JoinNow button
        driver.findElement(By.xpath("//a[.='Join Now!']")).click();

        //adding title, first name and last name to registration page using POM
        RegistrationPage registrationPage = new RegistrationPage();

        Select titleDropdown = new Select(registrationPage.title);

        titleDropdown.selectByIndex(1);


        registrationPage.firstname.sendKeys("Mike");
        registrationPage.surname.sendKeys("Smith");

        //Checking the tick box with text 'I accept the Terms and Conditions and certify that I am over
        //the age of 18.' and unchecking the other 2
        for(WebElement each: registrationPage.checkbox){
            each.click();
        }

        //Submit the form by clicking the JOIN NOW button
        registrationPage.joinnowBtn.click();

        //Validate that a validation message with text ‘ This field is required’ appears under the date of
        //birth box
        BrowserUtils.waitForVisibility(registrationPage.requiredField, 10);

        Assert.assertTrue(registrationPage.requiredField.isDisplayed());


    }



}
