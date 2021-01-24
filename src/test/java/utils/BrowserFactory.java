package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class BrowserFactory {
    static WebDriver factoryDriver;
    private static HashMap<String, String> configmap = ProportiesFile.read( "src/test/resources/environement/config.proporties");
    static String webBrowserType = configmap.get("browser");

  public static  WebDriver getFactoryDriver(){
        //chrome
      switch (webBrowserType){
          case "chrome":
              System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
              factoryDriver = new ChromeDriver();
              break;
          case "ie":
              break;
          case "firefox":
              break;
          default:
              break;

      };

        //IE
        //firefox

        return factoryDriver;
    };
}
