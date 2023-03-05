package org.pages;
import org.PageObject.PageObj2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.browser.com.Browser.driver;

public class Page2 {

    static PageObj2 Trial;

    public static String SearchText(){
        Trial = new PageObj2();
        return Trial.searchItems().getText();

    }
        public static void productselection (String lists) {
            try {
                Thread.sleep(3000);
                List<WebElement> list = Trial.itemSelection().findElements(By.xpath(".//li/div/div/div[3]/div/h4/a"));
                for(WebElement ele :list){
                 String products =ele.getText();
                 if (products.contains(lists))
                    {
                        ele.click();
                        break;
                    }
                }


               /* Thread.sleep(3000);
                driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div/div[2]/div/form/button")).click();
                Thread.sleep(3000);
               driver.findElement(By.xpath("/html/body/div/div[2]/aside/div[2]/div/div/p[3]/a[2]")).click();*/
            }

        catch(Exception e){

                System.out.println(e);

            }
    }
}