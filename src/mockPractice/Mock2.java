package mockPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(2000);
		
		WebElement profile=driver.findElement(By.xpath("//span[text()='Profile']"));
		profile.click();
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("Shirts");
		Thread.sleep(2000);
		
		WebElement searchbutton=driver.findElement(By.xpath("//a[@class='desktop-submit']"));
		searchbutton.click();
		Thread.sleep(2000);
		
		WebElement click=driver.findElement(By.xpath("//input[@value='women,men women']"));
		click.click();
		

		
		
		
	}

}
