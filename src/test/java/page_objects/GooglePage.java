package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {


    @FindBy(name = "ssoEmail")
    private static WebElement email;
    @FindBy(name = "ssoPass")
    private static WebElement password;
    @FindBy(id = "sso-form_0")
    private static WebElement okButton;
    @FindBy(className = "menu___pecxl")
    private static WebElement menu;
    @FindBy(linkText = "Espace Client")
    private static WebElement espace_cleint;
    @FindBy(css = "#skipToMenu > div > ul > li:nth-child(1) > a")
    private static WebElement compte;


    public static void email (String keyword){
        email.clear();
        email.sendKeys(keyword);
    };

    public static  void mp(String keyword){
        password.clear();
        password.sendKeys(keyword);
        okButton.click();
    };

    public static  void moveCompte(){
       menu.click();
       espace_cleint.click();
       compte.click();
    };

}
