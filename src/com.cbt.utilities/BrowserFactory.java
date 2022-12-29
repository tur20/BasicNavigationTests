package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browserType){

        if (System.getProperty("os.name").contains("Windows")){
            if (browserType.equalsIgnoreCase("safari")){
                System.err.println("Given browser type is not supported");
                return null;
            }else if (browserType.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }else if (browserType.equalsIgnoreCase("edge")){
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }else if (browserType.equalsIgnoreCase("opera")) {
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
            }else {
                System.out.println("Given browser type is not exist/ is not currently supported");
                return null;
            }
        }else  if (System.getProperty("os.name").contains("Mac")) {
            if (browserType.equalsIgnoreCase("edge")) {
                System.err.println("Given browser type is not supported");
                return null;
            } else if (browserType.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            } else if (browserType.equalsIgnoreCase("opera")) {
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
            } else if (browserType.equalsIgnoreCase("safari")) {
                WebDriverManager.safaridriver().setup();
                return new SafariDriver();
            }else {
                System.out.println("Given browser type is not exist/ is not currently supported");
                return null;
            }
        }else {
                System.out.println("Given browser type is not exist/ is not currently supported");
                return null;
            }


    }

}
/*
1. Create class BrowserFactory under utilities package.
2. Create a public static method getDriver which takes a string argument.
3. If you are using Windows, and if the String argument is `safari`, return null. If
you are using Mac, and if the String argument is `edge`, return null.
NOTE For this step, you need to research how to find out your operating
system programmatically using Java.
4. In all other cases, return a new WebDriver object for ChromeDriver,
FirefoxDriver, EdgeDriver or SafariDriver based on the value of the string
argument.
NOTE For this exercise, you need to research how to launch Edge using
Selenium if you are using Windows.
NOTE For this exercise, you need to research how to launch Safari using
Selenium if you are using Mac.
 */