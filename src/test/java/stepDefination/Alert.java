package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AlertPage;
import utilities.BaseClass;

import java.util.List;

public class Alert {

    //driver.switchto().alert().accept();
    //driver.switchto().alert().dismiss();
    //driver.switchto().alert().getText();

    WebDriver driver;

    AlertPage alertPage;

    @Given("user navigate to the Practice page")
    public void user_navigate_to_the_Practice_page(){
        alertPage =new AlertPage(BaseClass.getDriver());
        alertPage.clickOnPractice();
    }

    @When("user click on Try it")
    public void user_click_on_Try_it(){
        alertPage.clickOnTryIt();
    }

    @Then("Alert box is present")
    public void Alert_box_is_present(){
        alertPage.validateAlertBox();
    }

    @Then("User should be able to click Ok")
    public void User_should_be_able_to_click_Ok() throws InterruptedException {

    }

    @When("user navigate inside the iFrame")
    public void user_navigate_inside_the_iFrame(){
        WebElement iframePath = driver.findElement(By.xpath("//iframe[@src=\"https://uprightforum.tech\"]"));
        driver.switchTo().frame(iframePath);
    }


    @Then("User should be able to click on practice page")
    public void User_should_be_able_to_click_on_practice_page(){
        WebElement practiceLink = driver.findElement(By.xpath("//a[text()='Practice']"));
        practiceLink.click();

    }

    @Then("User can click on alert inside the iFrame")
    public void User_can_click_on_alert_inside_the_iFrame(){

    }
}
