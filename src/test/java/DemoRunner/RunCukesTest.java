package DemoRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/"},glue = {"stepdefs"}, tags={"@ReportPage"})

public class RunCukesTest {

}
