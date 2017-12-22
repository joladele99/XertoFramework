package Steps;
import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;


public class Register extends testBase {
    @Before
    public void  setup() throws IOException {
        initialize();
    }


    @When("^I click on the SignIn button$")
    public void i_click_on_the_SignIn_button() throws Throwable {
        driver.findElement(By.className("login")).click();
    }

    @When("^I fill in the create an account email address field$")
    public void i_fill_in_the_create_an_account_email_address_field() throws Throwable {
        driver.findElement(By.id("email_create")).sendKeys("JohnTest8888@gmail.com");
    }

    @When("^I click create an account button$")
    public void i_click_create_an_account_button() throws Throwable {
        driver.findElement(By.id("SubmitCreate")).click();
    }

    @When("^I fill in the first name text box$")
    public void i_fill_in_the_first_name_text_box() throws Throwable {
        driver.findElement(By.id("customer_firstname")).sendKeys("John");
    }

    @When("^I fill in the last name text box$")
    public void i_fill_in_the_last_name_text_box() throws Throwable {
        driver.findElement(By.id("customer_lastname")).sendKeys("Ola");
    }

    @When("^I fill in the password text box$")
    public void i_fill_in_the_password_text_box() throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys("Test1234");

    }

    @When("^I select my date of birth from all the date of birth drop down list$")
    public void i_select_my_date_of_birth_from_all_the_date_of_birth_drop_down_list() throws Throwable {
        Select dropdown1 = new Select(driver.findElement(By.id("days")));
        dropdown1.selectByValue("24");
        //driver.findElement(By.id("uniform-days")).isSelected(By);

        Select dropdown2 = new Select(driver.findElement(By.id("months")));
        dropdown2.selectByValue("7");

        Select dropdown3 = new Select(driver.findElement(By.id("years")));
        dropdown3.selectByValue("1981");
    }

    @When("^I fill in the address text box$")
    public void i_fill_in_the_address_text_box() throws Throwable {
        driver.findElement(By.id("address2")).sendKeys("1612 Dexter Street, P.O. Box, Imaginary Inc, Lanly");
//                "\n" +
//                "FORT WAYNE IN 46805\n" +
//                "UNITED STATES OF AMERICA");
    }

    @When("^I fill in the City text box$")
    public void i_fill_in_the_City_text_box() throws Throwable {
        driver.findElement(By.id("city")).sendKeys("SpringField");

    }

    @When("^I select state from the state drop down list$")
    public void i_select_state_from_the_state_drop_down_list() throws Throwable {
        Select dropdown4 = new Select(driver.findElement(By.id("id_state")));
        dropdown4.selectByValue("37");
    }

    @When("^I fill in the zip/postal code text box$")
    public void i_fill_in_the_zip_postal_code_text_box() throws Throwable {
        driver.findElement(By.id("postcode")).sendKeys("46805");

    }

    @When("^I select country from the country drop down list$")
    public void i_select_country_from_the_country_drop_down_list() throws Throwable {
        Select dropdown5 = new Select(driver.findElement(By.id("id_country")));
        dropdown5.selectByValue("21");
    }

    @When("^I fill in the mobile phone text box$")
    public void i_fill_in_the_mobile_phone_text_box() throws Throwable {
        driver.findElement(By.id("phone_mobile")).sendKeys("07788445533");
    }

    @When("^I fill the address alias for future reference text box$")
    public void i_fill_the_address_alias_for_future_reference_text_box() throws Throwable {

    }

    @When("^I click Register button$")
    public void i_click_Register_button() throws Throwable {
        driver.findElement(By.id("alias")).sendKeys("LaLaLand");
    }

    @Then("^I should Register successfully$")
    public void i_should_Register_successfully() throws Throwable {
        driver.findElement(By.id("submitAccount")).click();

    }

    @And("^I enter home phone in the home phone text box$")
    public void iEnterHomePhoneInTheHomePhoneTextBox() throws Throwable {
        driver.findElement(By.id("phone")).sendKeys("415 555 2671");
    }

    @And("^I enter Additional information in the Additional information text box$")
    public void iEnterAdditionalInformationInTheAdditionalInformationTextBox() throws Throwable {
        driver.findElement(By.id("other")).sendKeys("This is cool");

    }
}
