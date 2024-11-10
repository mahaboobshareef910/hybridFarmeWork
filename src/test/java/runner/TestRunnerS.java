package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resource\\RegisterYahoo.feature",tags="@Register",
				 glue={"stepdefinitions","hooks"},
			       publish=true,
				 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})
public class TestRunnerS {
//TestRunner
	

}

