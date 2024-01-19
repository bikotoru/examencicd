package com.testqa;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "com.testqa",
        plugin = {"pretty", "junit:target/cucumber-reports/Cucumber.xml"},
        monochrome = true
)
public class TestRunner {
}
