package myStore;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/cucumber/feaatures/myStore/workshop-task-2.feature",
        plugin = {"pretty"}
)
public class myStoreTestV2 {
}
