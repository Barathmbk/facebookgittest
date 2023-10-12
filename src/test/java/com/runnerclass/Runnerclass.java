package com.runnerclass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass;

import junit.framework.Assert;

public class Runnerclass extends Baseclass {

	
	@BeforeClass
	public void launch() {
		  getDriver("chrome");
		  launchUrl("https://www.facebook.com/");
	}
	
	@Test (priority = 1)
	public void validation() {
		String actual = driver.getCurrentUrl();
		String expected = "https://www.facebook.com/";
		Assert.assertEquals(actual, expected);
		}
	@Test(priority = 2)
	private void facebookLogin() {
		driver.findElement(By.id("email")).sendKeys("525563589");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
	}
		@Test(priority = 3)
		public void failedPage() {
			  screenshot("Error");	}
  @AfterClass
  public void Close(){
	  exit();
  }
}


