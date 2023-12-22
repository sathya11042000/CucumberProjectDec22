package org.step;

import org.junit.AfterClass;
//=
import org.junit.runner.RunWith;
import org.jvm.GenarateJvm;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.step", plugin = { "html:target",
		"junit:JunitFolder\\junitreport.xml", "json:JsonFolder\\jsonrep.json","rerun:src/test/resources/failed.txt" })
public class RunnerClass {

	@AfterClass
	public static void genareteJvmMethod() {
		//classname.methodname(string jonson);
		GenarateJvm.generateJvmReport("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberBatch1\\JsonFolder\\jsonrep.json");
	}

}
