package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.WindowPage;
import utilities.BaseClass;

public class WindowHandling {

    WindowPage windowPage;


    @When("user click the Open Window")
    public void user_click_the_open_window() {
        windowPage = new WindowPage(BaseClass.getDriver());
        windowPage.clickOnWindow();
    }

    @Then("Validate that user can switch to the second window")
    public void validate_that_user_can_switch_to_the_second_window() throws InterruptedException {
        windowPage.switchToNewWindow();

    }

    @Then("Validate that user can switch to the first window")
    public void validate_that_user_can_switch_to_the_first_window() {
        windowPage.switchingtoFirstWindow();

    }
}
