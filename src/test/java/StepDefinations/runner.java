package StepDefinations;

//Right Click -> Configure -> Cucumber project 

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Arti\\Training\\CucumberPKG\\src\\main\\java\\Features" 
		,glue={"StepDefinations"}
		,monochrome = true
		)


public class runner {

}
