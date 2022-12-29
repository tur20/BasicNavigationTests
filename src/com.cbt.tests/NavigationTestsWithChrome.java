package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTestsWithChrome {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
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
/*
1. Create class NavigationTests under tests package.
2. Automate the provided test case using 3 different browsers.
4. Each test should close the browser after completion.
Test Case
1. Open browser
2. Go to website https://google.com
3. Save the title in a string variable
4. Go to https://etsy.com
5. Save the title in a string variable
6. Navigate back to previous page
7. Verify that title is same is in step 3
8. Navigate forward to previous page
9. Verify that title is same is in step 5
 */