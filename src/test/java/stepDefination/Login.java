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

import java.util.List;

public class Login {
    WebDriver driver;


//    @Given("browser is open and navigate to the Base URL")
//    public void browser_is_open_and_navigate_to_the_Base_URL(){
//        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();//Open the browser
//        driver.get("https://uprightforum.tech/"); //Navigate to the base URL
//    }

    @Given("user navigate to the login page")
    public void user_navigate_to_the_login_page() {
        WebElement loginLinkPath = driver.findElement(By.xpath("//i[@class='fas fa-user']"));
        loginLinkPath.click();

    }
    @When("user enter valid {string}")
    public void user_enter_valid_username(String username) {

        WebElement userNamePath = driver.findElement(By.xpath("//input[@id='username-44']"));
        userNamePath.sendKeys(username);
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user enter a valid {string}")
    public void user_enter_valid_password(String password) {
        WebElement passwordPath = driver.findElement(By.xpath("//input[@id='user_password-44']"));
        passwordPath.sendKeys(password);
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user click on Login button")
    public void user_click_on_login_button() {
        WebElement loginButtonPath = driver.findElement(By.xpath("//input[@id='um-submit-btn']"));
        loginButtonPath.click();
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Validate that user is navigated to the Home page.")
    public void validate_that_user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        WebElement image = driver.findElement(By.xpath("//img[contains(@class,'gravatar avatar avatar-96')]"));
        image.click();

        WebElement myAccountPath = driver.findElement(By.xpath("//a[text()='My Account']"));
        myAccountPath.click();

        List<WebElement> names = driver.findElements(By.xpath("//a[contains(text(),'Upright Tech')]"));
        String myName = names.get(0).getText();
        if(myName.equalsIgnoreCase("Upright Tech")){
            System.out.println("I logged in");
        }
        else{
            System.out.println("having login issue");
        }
    }




}
