package stepdefenitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Features/login.feature"}, glue={"stepdefenitions"}, plugin= {"pretty"})
public class Testrunner extends AbstractTestNGCucumberTests {

}
