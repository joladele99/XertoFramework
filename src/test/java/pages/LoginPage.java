package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how= How.ID, using= "email")
    public static WebElement myEmail;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement myPassword;

    @FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
    public static WebElement forgotPassword;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public static WebElement loginBtn;

    @FindBy(how =How.ID, using = "email_create")
    public static WebElement createEmail;



    public void type_email(String email){
        myEmail.sendKeys(email);
    }

    public void type_passwprd(String password){
        myPassword.sendKeys(password);
    }

    public void click_Login(){
        loginBtn.click();
    }

    public void  click_forgot_password(){
        forgotPassword.click();
    }

    public void type_register_email(String regemail){

    }

}
