package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HoverOverPage {

    public HoverOverPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
@FindBy(linkText = "https://uprightforum.tech/practice/")
WebElement practiceLink;
@FindBy(xpath = "//button[contains(@class,'mouse-over-button')]")
WebElement mouseHover;

    @FindBy(xpath = "//a[text()='Option 1']")
    WebElement optionOne;

    @FindBy(xpath = "//a[text()='Option 2']")
    WebElement optionTwo;

    public void ppPage(){
        practiceLink.click();
    }

    public void mouseHoverOver(){
        mouseHover.click();
    }

    public void clickOptionOne(){
        optionOne.click();
    }

    public void clickOptionTwo(){
        optionTwo.click();
    }
//    public void hoverOnAccount(){
//        new Actions(driver).moveToElement(hoverOnAccount).build().perform();
//    }

//    public void allActions() throws InterruptedException {
//        WebElement orderPath = driver.findElement(By.xpath("//span[text()='Orders']"));
//        orderPath.click();
//
//        //executing double and right click
//        WebElement emailPath = driver.findElement(By.xpath("//input[@id='ap_email']"));
//        //Right click on email field
//        new Actions(driver).contextClick(emailPath).build().perform();
//        Thread.sleep(3000);
//        new Actions(driver).sendKeys("Razia").build().perform();
//        WebElement continuePath = driver.findElement(By.xpath("//input[@id='continue']"));
//        //double-click on Continue
//        Thread.sleep(3000);
//        new Actions(driver).doubleClick(continuePath).build().perform();
//    }
}
