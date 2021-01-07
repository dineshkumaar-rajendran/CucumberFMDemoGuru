package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.java.*;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"src/test/resources/AppFeatures/AppLogin.feature"},
				glue = {"StepDefinitions", "AppHooks"}, 
				plugin = {"pretty"})
<<<<<<< HEAD
public class MyTestRunner { 
=======
public class MyTestRunner {
>>>>>>> 44b2f3ce5aa48c2410b86e8e19c2106b1ce01e41

}
