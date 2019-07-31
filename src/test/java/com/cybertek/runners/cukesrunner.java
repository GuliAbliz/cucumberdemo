package com.cybertek.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                  "html:target/cucumber-reports",
                 "junit:target/cucumber-reports/Cucumber.xml" },

        features  ="src/test/resources/features/login.features",
          glue = "com/cybertek/step_definition" ,
        dryRun = false


)

public class cukesrunner {
}
