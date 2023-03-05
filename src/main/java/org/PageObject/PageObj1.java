package org.PageObject;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObj1 extends Browser {
    public PageObj1(){

        PageFactory.initElements(driver,this);
     }
    //driver.findElement(By.xpath("//input[@name='s']"))
     @FindBy(xpath = "//input[@name='s']")
    WebElement searchBar;
     public WebElement searchBox(){

         return searchBar;
     }
     @FindBy(xpath = "//div[@class='search']/div/form//div[2]/span")
     WebElement clickBar;
     public WebElement clickIcon(){

         return clickBar;
     }

}
