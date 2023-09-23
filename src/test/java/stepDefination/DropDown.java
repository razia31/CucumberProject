package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.AlertPage;
import pageObjects.DropDownPage;
import utilities.BaseClass;

public class DropDown {
    WebDriver driver;
    Select dropDown;

    DropDownPage dropDownPage;

   @Given("browser is open and navigate to the Base URL")
//    public void browser_is_open_and_navigate_to_the_Base_URL() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();
//        driver.get("https://uprightforum.tech/practice");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//    }

    @Given("user navigate to Practice page")
    public void  user_navigate_to_Practice_page(){
       dropDownPage =new DropDownPage(BaseClass.getDriver());
       dropDownPage.clickOnPractice();

    }

    /*
    dropdown I can use
    a. selectbyvisibletext
    b. selectbyindex
    c. selectbyvalue
     */
    @When("user see the Select an Option")
    public void user_see_the_Select_an_Option(){
       dropDownPage.clickOnSelectanOption();

    }

    @Then("user can select Option one")
    public void user_can_select_Option_one(){
        dropDownPage.clickOnOptionOne();
    }
    @Then("user can select Option two")
    public void user_can_select_Option_two(){

        dropDownPage.clickOnOptiontwo();
    }
    @Then("User can select Option three")
    public void User_can_select_Option_three(){

        dropDownPage.clickOnOptionThree();
    }

}
