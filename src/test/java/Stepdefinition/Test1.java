package Stepdefinition;

import io.cucumber.java.en.*;
import org.browser.com.Browser;
import org.browser.com.Browser.*;
import org.pages.Page1;
import org.screenshot.com.Screenshot1;
import org.testng.Assert;
import org.testng.Reporter;


public class Test1 {
    @Given("User opens the browser")
    public void user_opens_the_browser() {
        Browser.Intialization();
    }
    @Then("User enters the {string}")
    public void user_enters_the(String string) {
       Browser.Setup(string);

    }
    @And("User verifies the title of the application")
    public void user_verifies_the_title_of_the_application() {
     try{
         Thread.sleep(3000);
         Screenshot1.ScreenShot("Title");

         Assert.assertEquals("Smartbazaa – World of Asian Foods", Page1.Title());
         Reporter.log("Pass");
     }
     catch(AssertionError | Exception e){
         System.out.println(e);
         Reporter.log(e.getMessage());
         Reporter.log("Fail");

     }
    }
    @Then("User close the browser")
    public void user_close_the_browser() {
       Browser.Close();

    }



}
