package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Hompage {

    @FindBy(how = How.XPATH, using= "//*[@id=\'block_top_menu\']/ul/li[1]/a")
    public static WebElement women;

    @FindBy(how = How.XPATH, using = "//*[@id=\'block_top_menu\']/ul/li[2]/a")
    public static WebElement dresses;

    @FindBy(how = How.XPATH, using ="//*[@id=\'block_top_menu\']/ul/li[3]/a")
    public  static  WebElement tshirts;

    @FindBy(how = How.ID, using ="header_logo")
    public  static  WebElement logo;

    public void click_women_button() {
        women.click();
    }

    public void click_dress_button(){
       dresses.click();
    }

    public void  click_tshirt_botton(){
        tshirts.click();
    }

    public void verify_logo(){
        logo.isDisplayed();
    }

}
