package com.ds.screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.utility;

public class screenshot {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\AutomationSoftwares\\New folder\\latestChromeDriver\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       utility.Screenshot(driver,"Fackebook launched successfully");
       
       
	}

}
