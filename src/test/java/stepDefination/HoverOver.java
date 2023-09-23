package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.HoverOverPage;
import utilities.BaseClass;

public class HoverOver {

    //with the help of action class we can do right-click, double click, drag and drop
    //with the help of action class we can do the keyboard handling...like Ctrl C, Ctrl V, press on Shift
    WebDriver driver;

    HoverOverPage hoverOverPage;

@Given("user navigate to UA practice page")
public void user_navigate_to_UA_practice_page(){
    hoverOverPage = new HoverOverPage(BaseClass.getDriver());
    hoverOverPage.ppPage();
}


    @When("user hover the mouse over the option")
    public void user_hover_the_mouse_over_the_option(){
      hoverOverPage.mouseHoverOver();


    }

    @Then("user can select Option one using Actions Class")
    public void user_can_select_Option_one_using_action_Class() throws InterruptedException {
     hoverOverPage.clickOptionOne();

    }

    @Then("user can select Option two using Actions Class")
    public void user_can_select_Option_two_using_Action_Class(){
    hoverOverPage.clickOptionTwo();


    }
}
