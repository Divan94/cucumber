package com.telecom.resources;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
	public static WebDriver driver;
	
	public void launch(String url) {
        
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
		chromeCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches",
                                       Arrays.asList("disable-popup-blocking"));
		
		options.addArguments("headless");
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

	public void insertText(WebElement ele,String values) {
		ele.sendKeys(values);
		
	}
		public void button(WebElement ele) {
			ele.click();

		}

	}

