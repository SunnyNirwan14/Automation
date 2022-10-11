package automated_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
		WebElement signin=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		signin.click();		
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("kirannirwan");
		Thread.sleep(1500);
		
		WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement threedot=driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-topbar-menu-button-renderer']"));
		threedot.click();
		Thread.sleep(3000);
		
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Virat Kohli century in england");
		
		WebElement searchbutton=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		searchbutton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement explore=driver.findElement(By.xpath("//a[@title='Explore']"));
		explore.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement shorts=driver.findElement(By.xpath("//a[@title='Shorts']"));
		shorts.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement sub=driver.findElement(By.xpath("//a[@title='Subscriptions']"));
		sub.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement library=driver.findElement(By.xpath("//a[@title='Library']"));
		library.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement history=driver.findElement(By.xpath("//a[@title='History']"));
		history.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement searchbutton1=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		searchbutton1.click();
		Thread.sleep(2000);
		
		WebElement click=driver.findElement(By.xpath("//a[@id='video-title']"));
		click.click();
		Thread.sleep(3000);
		
		WebElement youtube=driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
		youtube.click();
		
		
	}

}
