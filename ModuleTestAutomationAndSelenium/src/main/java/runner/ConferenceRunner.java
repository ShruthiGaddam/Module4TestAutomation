package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SHRUTHI\\Desktop\\capGProjects\\ModuleTestAutomationAndSelenium\\src\\main\\java\\feature\\login.feature", glue = {
		"stepDefinition" })
public class ConferenceRunner {

}
