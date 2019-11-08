package samsungedge.SamsungEdge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Samsungedge {
	
	
	WebDriver driver;
	@BeforeMethod
	public void tearUP(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver  = new ChromeDriver();
	}
	
	@Test
	public void testLaunchingBrowser(){
		driver.get("http://www.samsungedge.com");
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.out.println("http://www.samsungedge.com");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.samsungedge.com");
		
		
		
	}

}
