package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenarateJvm {
	
	
	public static void generateJvmReport(String jsonPath) {
		//step1:Mention the target folder location - File
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberBatch1\\JvmFolder");
		
		//step2:Add details to the report using Configuration class  ---- addClassifications("point1","point2")
		Configuration c=new Configuration(f, "facebook & amazon");
		c.addClassifications("platformname", "windows");
		c.addClassifications("platformversion", "10");
		c.addClassifications("browsername", "chrome");
		c.addClassifications("browserverion", " 120");
		
		//step3:Add json file paths into List<String>
		List<String> li=new LinkedList<String>();
		li.add(jsonPath);
		
		//step4:Create object for ReportBuilder class 
		ReportBuilder r=new ReportBuilder(li, c);
		r.generateReports();
		
		
	}
}
