package utilities;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    private static WebDriver driver;

    public BaseClass() throws InterruptedException, IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\test\\env.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String myURL = prop.getProperty("url");
        System.out.println(myURL);

        String myBrowser = prop.getProperty("browser");
        System.out.println(myBrowser);

            if (myBrowser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
          else if (myBrowser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
                System.out.println("Check the driver");
            }

            driver.get("url");
            driver.manage().window().maximize();
            Thread.sleep(3000);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        }



    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() throws InterruptedException, IOException {
        BaseClass obj = new BaseClass();
    }
}
