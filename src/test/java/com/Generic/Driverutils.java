package com.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverutils {
	
	static WebDriver driver;
	public static void createDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Demo_Techshop_testNG\\src\\test\\resources\\chromedriver.exe");	
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver() {
		if(driver==null) {
			createDriver();
		}
		return driver;
	}

}
