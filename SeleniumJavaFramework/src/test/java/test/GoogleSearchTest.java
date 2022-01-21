package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	private static GoogleSearchPageObjects googleSearch; 
	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//goto google.com
		driver.get("https://www.google.com");
		
		//enter text in search textbox
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
//		GoogleSearchPage.texto_box_search(driver).sendKeys("Automation step by step");
		
		googleSearch.setTextInSearchBox("TEST AUTOMATIO !!!!");
		
		//submit
//		driver.findElement(By.name("q")).submit();
		
//		GoogleSearchPage.texto_box_submit(driver).submit();
		
		Thread.sleep(3000);
		
		googleSearch.clickSearchButton();
		
//		GoogleSearchPage.button_search(driver).click();
		
		//close browser
//		driver.close();
		
		System.out.println("Test Completed Successfuly");
		
	}
}
