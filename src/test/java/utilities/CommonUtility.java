package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;


public class CommonUtility extends BaseClass{

    public WebDriver driver; // if we do not use public or private then it will be package private/no access--

    public CommonUtility() throws InterruptedException, IOException {
    }

    //that means it will be accessible only within the package.
    public static void screenshot(String fileName) throws IOException {
        TakesScreenshot ss = (TakesScreenshot) BaseClass.getDriver(); //type casting
        File memoryLocation = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(memoryLocation, new File("C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\test\\screenShotFolder"+fileName));
    }

    public static void captureScreenShotonFailure(ITestResult result) throws InterruptedException {
        if (result.getStatus() == ITestResult.FAILURE)
            try {
                screenshot(result.getName() + "fail.png");
            }
        catch (Exception e) {
                e.printStackTrace();
            }

        }

        public static void JSExecutorScrollHeight () throws InterruptedException {
            JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver(); //js is a reference variable
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            Thread.sleep(3000);
        }


        public static void jsScrollByNumber () {
            JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
            js.executeScript("window.scrollBy(0,700)");
        }

        public static void scrollIntoView (WebElement element){
            JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
            js.executeScript("argument[0].scrollIntoView()", element);
        }
    }
