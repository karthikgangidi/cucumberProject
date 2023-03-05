package Stepdefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.screenshot.com.Screenshot1;
import org.testng.*;
import org.pages.Page1;
import org.pages.Page2;
import org.pages.Page3;

public class Test2 {

    @And("User enters the {string} data in the search bar")
    public void user_enters_the_data_in_the_search_bar(String string) {

        Page1.searchData(string);
    }
    @When("User clicks on the search icon")
    public void user_clicks_on_the_search_icon() {
        Page1.clickon();

    }
    @And("User verifies the {string} results")
    public void user_verifies_the_results(String string) {
        try {

            Assert.assertEquals(string, Page2.SearchText());
        }catch(AssertionError e){
            System.out.println(e);
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Then("User selects the {string} from the list")
    public void user_selects_the_from_the_list(String string) {
        Page2.productselection(string);

    }
    @And("User verifies the {string} result")
    public void user_verifies_the_result(String string) {
        try {

            Assert.assertEquals(string, Page3.verify());

    }catch(AssertionError e){
        System.out.println(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
