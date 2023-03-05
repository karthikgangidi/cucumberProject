package org.pages;
import org.PageObject.PageObj1;
import org.openqa.selenium.By;

import static org.browser.com.Browser.driver;

public class Page1 {
    static PageObj1 Practice;
    public static String Title(){
       return driver.getTitle();

    }
    public static void searchData(String product) {
        Practice = new PageObj1();

      Practice.searchBox().sendKeys(product);
    }
   public static void clickon(){
       Practice.clickIcon().click();

    }
}
