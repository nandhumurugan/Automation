package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/featurefile"},
        glue = {"stepdefinition"},
        tags = "@category",
        plugin = {"pretty",
        "html:target/testoutput/report.html",
        "json:target/testoutput/jsonreport.json",
        "junit:target/testoutput/xmlreport.xml"}
)

public class Runner {
}
