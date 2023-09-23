package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\test\\java\\features\\HoverOver.feature"}, glue={"stepDefination"},
                plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                monochrome = true,
                publish =true
        )

   /* (features = {"C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\test\\java\\features\\DropDown.feature"}, glue={"stepDefination"},
            plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"},
            monochrome = true,
            publish =true

    */

/* Cucumber options is an annotations...it takes two parameters
one is feature location another is step def location
if you have 100 feature file in a package... give path only up to package level like
src/test/java/features
or if you want to run a specific feature file give src/test/java/features/Login.feature
 */

public class RunnerClass {


}