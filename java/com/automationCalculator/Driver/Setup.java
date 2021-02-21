package com.automationCalculator.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Setup {
	public static WebDriver driver;
	@Before
	public void setup() {
	  System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriver 3");
      driver = new ChromeDriver();
	  DesiredCapabilities cap = DesiredCapabilities.chrome();
      cap.setCapability("applicationCacheEnabled", false);
	  driver.manage().window().maximize();
		  
	}
	@After
	public void tearDown() {
		  driver.quit();
	}
}
