package content;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MauseActions 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000); 
		
		WebElement Account=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act=new Actions(driver);		//actions class object import from selenium
		act.moveToElement(Account).perform();
		Thread.sleep(1000);
		//act.contextClick();		//For right click
		//act.doubleClick();		//For double click
		//act.dragAndDrop(Account, Account);	//for drag and drop
		//act.build();
		//act.perform();
		//act.scrollToElement(Account);
	
		WebElement Primevideo=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		act.moveToElement(Primevideo).click().perform();
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement language=driver.findElement(By.xpath("//span[@class='nav-icon nav-arrow']"));
		act.moveToElement(language).perform();
		Thread.sleep(1000);
		
		WebElement marathi=driver.findElement(By.xpath("//span[text()='मराठी']"));
		act.moveToElement(marathi).click().perform();
		
		
		
		

}
}