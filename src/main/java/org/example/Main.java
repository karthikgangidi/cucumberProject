package org.example;
import org.browser.com.*;
import org.pages.*;
public class Main  {
    public static void main(String[] args) throws Exception {
Browser.Intialization();
Browser.Setup("https://www.smartbazaar.co.uk/");

Thread.sleep(1000);
System.out.println(Page1.Title());
Page1.searchData("flowers");
Page1.clickon();
Thread.sleep(3000);
System.out.println(Page2.SearchText());
Page2.productselection("LOTUS FLOWER BUD (SINGLE)");
System.out.println(Page3.verify());
Browser.Close();


    }
}