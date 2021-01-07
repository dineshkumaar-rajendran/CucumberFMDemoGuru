package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.java.*;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"src/test/resources/AppFeatures/AppLogin.feature"},
				glue = {"StepDefinitions", "AppHooks"}, 
				plugin = {"pretty"})

public class MyTestRunner { 



}
