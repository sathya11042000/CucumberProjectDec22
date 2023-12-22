package org.lib;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void browserLaunch() {
		 driver=new ChromeDriver();

	}

	
	public static void launchUrl(String url) {
		driver.get(url);

	}
	
	public static void maxWin() {
		driver.manage().window().maximize();
	}
	
	public static void fillText(WebElement webRef,String value) {
		webRef.sendKeys(value);

	}
	
	public static void btnClick(WebElement webRef) {
		webRef.click();
	}
	
	
	public static void prtTittle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	public static void prtUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static  void getDateTime() {
	Date d =new Date();
	System.out.println(d);

	}
	
	
	public static void browserClose() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
