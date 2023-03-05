package org.pages;

import org.PageObject.PageObj3;
import org.openqa.selenium.By;

import static org.browser.com.Browser.driver;

public class Page3 {
    static PageObj3 read;
    public static String verify(){
        read = new PageObj3();
      return read.verification() .getText();

    }
}
