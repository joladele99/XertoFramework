package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\'center_column\']/h1")
    public  static WebElement myAccount;
    //public  static WebElement account_name;


    @FindBy(how = How.CLASS_NAME, using = "logout")
    public static  WebElement logoutBtn;

    public void verify_account() {
        myAccount.isDisplayed();
        //String acc_name = account_name.getText();
        //System.out.println(acc_name);
    }

    public void  click_logoutBtn(){
        logoutBtn.click();
    }
}
