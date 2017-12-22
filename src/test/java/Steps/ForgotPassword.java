package Steps;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

public class ForgotPassword extends testBase {
    @Before
    public void  setup() throws IOException {
        initialize();
    }



    @And("^I click the fogort password link$")
    public void iClickTheFogortPasswordLink() throws Throwable {
        driver.findElement(By.linkText("Forgot your password?")).click();
    }


    @And("^I click Retrieve Password button$")
    public void iClickRetrievePasswordButton() throws Throwable {
        // Scroll down
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        //driver.findElement(By.cssSelector("btn.btn-default.button.button-medium")).click();  //the space had to be change to a dot to allow cssSelector to see the class and not fail it
        driver.findElement(By.xpath("//*[@id=\'form_forgotpassword\']/fieldset/p/button")).click(); //Change the double quote that comes with the xpath to single quote
    }

    @Then("^I should see a message displayed$")
    public void iShouldSeeAMessageDisplayed() throws Throwable {
        String ExpectedMessage =  "A confirmation email has been sent to your address: JohnTest123@gmail.com";
        String ActualMessage = driver.findElement(By.xpath("//*[@id=\'center_column\']/div/p")).getText();
        System.out.println(ActualMessage);
        Assert.assertEquals(ExpectedMessage,ActualMessage);
    }

}
