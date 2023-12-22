package org.step;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=
"@C:\\Users\\ADMIN\\eclipse-workspace\\CucumberBatch1\\src\\test\\resources\\failed.txt",glue="org.step")

public class FailedRerun {

}
