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
    
    //private static HashMap<String, String> configmap = ProportiesFile.read( "src/test/resources/environement/config.proporties");
    //static String baseUrl = configmap.get("baseUrl");

   /* @Before("@api")
    public void init (){
        RestAssured.baseURI = baseUrl;

    }*/

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
