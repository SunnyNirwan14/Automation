package content;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//Implicit wait	(time)
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));	//Explicit wait	(time+condition) time interval of 500ms
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		Wait <WebDriver> wait1 = new FluentWait<WebDriver>(driver)				//Fluent wait (time+condition+polling frequency)
							.withTimeout(Duration.ofSeconds(10))
							.pollingEvery(Duration.ofSeconds(2))
							.ignoring(NoSuchElementException.class);
		
	}

}
