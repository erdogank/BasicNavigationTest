package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtilities;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {

        test1Chrome();



    }
    public static void test1Chrome(){
        /*
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
        WebDriver driver =BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();

        String titleGoogleAfter = driver.getTitle();

        StringUtilities.verifyEquals(titleGoogleAfter,titleGoogle);

        driver.navigate().forward();

        StringUtilities.verifyEquals(driver.getTitle(),titleEtsy);

        driver.close();





    }
}
