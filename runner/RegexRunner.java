package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", glue = { "stepDefinition" }, tags = "@Regex1",plugin="pretty")



public class RegexRunner
{

}
