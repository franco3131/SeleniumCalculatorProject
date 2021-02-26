package runner;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
         features="Features",
         glue="com.Multi",
         plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
 "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", 
"junit:target/cucumber-results.xml"},
        dryRun = false,
        strict = true,
        tags={"@calculator"},
        monochrome = true)

  public class Runner extends AbstractTestNGCucumberTests{
 
}