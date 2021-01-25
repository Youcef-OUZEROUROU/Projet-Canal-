package modules;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.GooglePage;
import utils.ProportiesFile;

import java.util.HashMap;

import static utils.BrowserFactory.getFactoryDriver;

public class Hooks {
    public static WebDriver driver;
    private GooglePage googlePage = new GooglePage();


    @Before("@toto")
    public void setUp(){
        driver = getFactoryDriver ();
        PageFactory.initElements(driver, googlePage);

    }

    @After("@toto")
    public void tearDown (){
        //driver.quit();

    }
}
