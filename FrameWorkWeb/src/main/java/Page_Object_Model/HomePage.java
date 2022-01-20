package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	//PAGE URL
	private static String PAGE_URL = "http://automationpractice.com/index.php";
	private WebDriver driver;
	
	//Locators
	//SignIn Button
	@FindBy(xpath =  "//a[@class='login']")
	private WebElement signInButton;
	
	
	
}
