package content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(100);
		//driver.manage().window().maximize();
		Thread.sleep(100);
		
		
		WebElement hotels=driver.findElement(By.xpath("//li[@class='menu_Hotels']"));
		hotels.click();					//xpath by attributes
		Thread.sleep(2000);
		
		WebElement homestays=driver.findElement(By.xpath("//span[text()='Homestays']"));
		homestays.click();				//xpath by text function
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.xpath("//button[contains(@data-cy,'submit')]"));
		search.click();					//xpath by contains(by attributes)
		Thread.sleep(2000);	
		driver.navigate().back();
		
		WebElement holidaypackage=driver.findElement(By.xpath("//*[text()='Holiday Packages']"));
		holidaypackage.click();			//xpath without using tag name
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
	}

}
