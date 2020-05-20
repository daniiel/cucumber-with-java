package cucumberoptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin = {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"}
//        , tags = {"@SeleniumTest"}
        , tags = {"@SmokeTest,@RegTest"}
)
public class TestRunner {
}
