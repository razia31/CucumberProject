package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseClass;

import java.util.Set;

public class WindowPage {
    String firstWindowID;

    public WindowPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@id='openwindow']")
    WebElement openWindowPath;
    @FindBy(xpath = "//a[text()='Access all our Courses']")
    WebElement allCourses;
    @FindBy(xpath = "//h1[text()='Practice Page']")
    WebElement practicePage;

    @FindBy(xpath = "//span[text='info@qaclickacademy.com']")
    WebElement email;

    public  void clickOnWindow(){
        openWindowPath.click();
    }

    public void switchToNewWindow() throws InterruptedException {
       firstWindowID = BaseClass.getDriver().getWindowHandle();
        System.out.println(firstWindowID);

      Set<String> multipleIDs = BaseClass.getDriver().getWindowHandles();
        System.out.println(multipleIDs.size());

        for(String m:multipleIDs){
            if (!m.equals(firstWindowID)){
                BaseClass.getDriver().switchTo().window(m);
            }
        }
        Thread.sleep(3000);

        String myText = email.getText();
        System.out.println(myText);
        BaseClass.getDriver().close();
    }

    public void switchingtoFirstWindow(){
       BaseClass.getDriver().switchTo().window(firstWindowID);
     //  input.sendKeys("Razia");
        BaseClass.getDriver().close();

    }
}
