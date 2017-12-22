package Steps;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Hompage;

import java.io.IOException;

import static base.testBase.driver;

public class Common extends testBase {
    @Before
    public void  setup() throws IOException {
        initialize();
    }


    @Given("^I am on the Home$")
    public void i_am_on_the_Home() throws Throwable {
       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        Thread.sleep(5000);


    }

    @Given("^I see a logo banner$")
    public void i_see_a_logo_banner() throws Throwable {
        //driver.findElement(By.id("header_logo")).isDisplayed();
        Hompage homepage = PageFactory.initElements(driver, Hompage.class);
        homepage.verify_logo();
    }
}
