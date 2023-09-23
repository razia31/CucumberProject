package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

import java.time.Duration;

public class AlertPage {

    //Constructor
    //Page Elements
    //Methods according to actions

    public AlertPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "href=\"https://uprightforum.tech/practice/\"")
    WebElement practicePath;
@FindBy(xpath = "//button[@id='alertBtn']")
      WebElement  tryItPath;
public void clickOnPractice(){
    practicePath.click();
}
    public  void clickOnTryIt(){
        tryItPath.click();
    }

    public void validateAlertBox(){

        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        String alertText = BaseClass.getDriver().switchTo().alert().getText();
        if (alertText.contains("knowledge"))
            System.out.println("Alert box is present");
        else{
            System.out.println("Alert box is not there");
        }
    }

    public void acceptAlert() throws InterruptedException {
        Thread.sleep(3000);
        BaseClass.getDriver().switchTo().alert().accept();
    }

}
