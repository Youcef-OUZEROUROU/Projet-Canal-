package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class GooglePage {

    static Random rnd = new Random();
    static String n = String.valueOf(rnd.nextInt(99));
    static String makeAdresse = n+ " "+ "AVENUE BON AIR";
    public static String adresse = makeAdresse;
    static String n1 = "01" + rnd.nextInt(90000000);


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

    @FindBy(name = "zipCode")
    private static WebElement codePostal;
    @FindBy(id = "streetName")
    private static WebElement modifAdresse;
    @FindBy(css = "#fix > input")
    private static WebElement tel;
    @FindBy(className = "spinner--btn")
    private static WebElement btn;

    @FindBy(className = "button")
    private static WebElement button;







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
    };
    public static  void modificationAdress(){
        codePostal.sendKeys("33700");
        modifAdresse.clear();
        modifAdresse.sendKeys(adresse);
        tel.clear();
        tel.sendKeys(n1);
        btn.click();
    };
    public static  void clickbtn (){
        button.click();
    };

}
