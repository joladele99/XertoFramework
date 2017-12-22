package Steps;
import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.Hompage;
import pages.LoginPage;
import pages.MyAccountPage;

import java.io.IOException;


public class Login extends testBase {
    @Before
    public void  setup() throws IOException {
        initialize();
    }


    @When("^I click SignIn button$")
    public void i_click_SignIn_button() throws Throwable {
        //driver.findElement(By.className("login")).click();
        CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
        commonpage.click_signinBtn();

    }

//    @When("^I enter username in the username field$")
//    public void i_enter_username_in_the_username_field() throws Throwable {
//        driver.findElement(By.id("email")).sendKeys("JohnTest123@gmail.com");
//
//    }
//
//    @When("^I enter password in the password field$")
//    public void i_enter_password_in_the_password_field() throws Throwable {
//        JavascriptExecutor jse =(JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,250)", "");
//        driver.findElement(By.id("passwd")).sendKeys("Test1234");
//
//    }

    @When("^I click the login Button$")
    public void i_click_the_login_Button() throws Throwable {
        //driver.findElement(By.id("SubmitLogin")).click();
    LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
    loginpage.click_Login();


    }

    @Then("^I souldbe loged in successfully$")
    public void i_souldbe_loged_in_successfully() throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\'center_column\']/h1")).isDisplayed();
    MyAccountPage myaccountpage = PageFactory.initElements(driver, MyAccountPage.class);
    myaccountpage.verify_account();
    }

    @And("^then I will click on the sgin button to log out$")
    public void thenIWillClickOnTheSginButtonToLogOut() throws Throwable {
        //driver.findElement(By.className("logout")).click();
     MyAccountPage myaccountpage = PageFactory.initElements(driver, MyAccountPage.class);
     myaccountpage.click_logoutBtn();
    }

    @And("^I Enter email in the \"([^\"]*)\" textbox$")
   // public void iEnterEmailInTheTextbox(String ) throws Throwable {
        //driver.findElement(By.id("email")).sendKeys(value);
    public void iEnterEmailInTheTextbox(String email) throws Throwable {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_email(email);
    }

    @And("^I Enter password in the \"([^\"]*)\" textbox$")
  //  public void iEnterPasswordInTheTextbox(String value) throws Throwable {
   //     JavascriptExecutor jse =(JavascriptExecutor) driver;
   //     jse.executeScript("window.scrollBy(0,250)", "");
   //     driver.findElement(By.id("passwd")).sendKeys(value);
    public void iEnterPasswordInTheTextbox(String password) throws Throwable {
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        LoginPage logingage = PageFactory.initElements(driver, LoginPage.class);
        logingage.type_passwprd(password);
    }

    @Then("^I should see an error \"([^\"]*)\" message details$")
    public void iShouldSeeAnErrorMessageDetails(String ErrorMessage) throws Throwable {
        String ExpectedMessage = ErrorMessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\'center_column\']/div[1]/ol/li")).getText();
        System.out.println(ActualErrorMessage);
        Assert.assertEquals(ExpectedMessage,ActualErrorMessage);
    }


}
