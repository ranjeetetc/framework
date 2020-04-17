package com.krn.actitime.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class createTask {
	@Test
  public void testCreateTask() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  
	  
	  
      //Navigate to a URL
	  Thread.sleep(30);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://toolsqa.com");
      System.out.println(driver.getTitle());
  }
}
