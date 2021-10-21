package com.telecom.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
	static WebDriver driver;
	
	public void launch(String url) {
        
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

	public void insertText(WebElement ele,String values) {
		ele.sendKeys(values);
		
	}
		public void button(WebElement ele) {
			ele.click();

		}

	}

