package org.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.browser.com.Browser.driver;

public class PageObj3 {

public PageObj3(){
    PageFactory.initElements(driver,this);
}
@FindBy(xpath="//*[@class= 'product_title entry-title']")
    WebElement confirm;
public WebElement verification(){
    return confirm;

}
}
