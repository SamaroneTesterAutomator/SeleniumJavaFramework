package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

public class TestNG_Demo {

	private static WebDriver driver;
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public static void googleSearchTest() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com");

		searchPageObj.setTextInSearchBox("ABC");
		Thread.sleep(3000);
		searchPageObj.clickSearchButton();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed Successfuly");
	}

}
