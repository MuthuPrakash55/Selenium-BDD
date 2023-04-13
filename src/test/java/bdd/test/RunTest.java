package bdd.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/feature/amazon3.feature",
					glue="bdd.test",
					plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty.html",
							"json:target/cucumber-reports/CucumberTestReport.json",
							"rerun:target/cucumber-reports/rerun.txt"},
						tags="@mobile")

public class RunTest {


	
}