package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src\\test\\java\\features\\login2.feature" }, glue = { "StepDefinitions" }, monochrome = true
// plugin = {"pretty", "html:target/Cucumber.html"}

)

public class TestRunner {

}
