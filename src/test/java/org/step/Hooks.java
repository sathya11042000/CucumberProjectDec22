package org.step;

import org.lib.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeExecution() {
		browserLaunch();

	}
	
	@After
	public void afterExecution() {
		browserClose();

	}

}
