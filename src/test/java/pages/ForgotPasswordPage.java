package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPage {


    @FindBy(how= How.ID, using= "email")
    public static WebElement myEmailAddress;

    @FindBy(how =How.XPATH, using = "//*[@id=\'form_forgotpassword\']/fieldset/p/button")
    public static WebElement retrievePasswordBtm;



    public void type_email_address(String email){
        myEmailAddress.sendKeys(email);
    }

    public void  click_retrive_password(){
        retrievePasswordBtm.click();
    }

}
