package com.krn.actitime.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
  @Test
  public void openBrowser() {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver();
      driver.get("http://toolsqa.com");
  }
}
