package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTestsWithEdge {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C://EdgeDriver.exe");

        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();

        driver.get("https://google.com");
        String googleTitle1 = driver.getTitle();

        driver.get("https://etsy.com");
        String etsyTitle1 = driver.getTitle();

        driver.navigate().back();
        String googleTitle2 = driver.getTitle();

        driver.navigate().forward();
        String etsyTitle2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitle1,googleTitle2);
        StringUtility.verifyEquals(etsyTitle1,etsyTitle2);




    }

}
