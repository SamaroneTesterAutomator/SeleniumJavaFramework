import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		
		String projectPath = System.getProperty("user.dir");
		
//		
//		System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckoDriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromeDriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		
//		System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\ieDriver\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		
	
		System.setProperty("webdriver.edge.driver", projectPath+"\\drivers\\edgeDriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		
//		WebElement textBox = driver.findElement(By.name("q"));
//		textBox.sendKeys("TESTE GOOGLE!!!!!");
		
//		List<WebElement> listOfInputsElements = driver.findElements(By.xpath("//input"));
//		int count = listOfInputsElements.size();
//		System.out.println("Count of Input Elements : "+count);
//		
	}
}
