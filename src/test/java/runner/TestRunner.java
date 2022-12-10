package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",		//-->feature file path
		glue="steps",							//--> step definition package name
		dryRun = true,							//-->mapping of steps in feature file (false)
		stepNotifications = true,				//-->step wise result status (false)
		monochrome=true,						//---> Clean console report
		tags="@sanity",			//---> To execute particular type of scenarios from feature files
		plugin= {"pretty","json:target/cucumber.json","html:target/cucumber.html"}	//master thought reporting		//"junit:target/aspire.xml"  "html:target/cucumber.html"
		)
public class TestRunner {

}
