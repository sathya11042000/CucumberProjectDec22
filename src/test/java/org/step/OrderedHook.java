package org.step;

import org.lib.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class OrderedHook extends BaseClass{
	
	@Before(order=4)
	public void beforeExecution1() {
		System.out.println("launch url");
		launchUrl("https://www.facebook.com/");
	}
	
	@Before(order=6)
	public void beforeExecution2() {
		System.out.println("to print the value before scenarios");
		maxWin();
	}
	
	@Before(order=2)
	public void beforeExecution3() {
		System.out.println("launch browser");
		browserLaunch();
	}
	
	@After(order=20)
	public void afterExecution() {
		System.out.println("close browser");
		browserClose();

	}
	@After(order=40)
	public void afterExecution1(Scenario s) {
		System.out.println("to print the value after scenarios");
		if (s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] ss = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(ss,"image/png");
			System.out.println("Scenario screenshot:" +s.getName());
			
		}

	}
	

}
