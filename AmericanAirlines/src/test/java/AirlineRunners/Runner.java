package AirlineRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/Airline/features/Airline.feature",
glue= {"com.steps"},
tags= {"@homepage"},
plugin = {"json:target/cucumber.json" } )




public class Runner extends AbstractTestNGCucumberTests {
	
	

}
