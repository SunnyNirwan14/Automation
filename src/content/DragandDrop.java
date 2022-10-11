package content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/droppable");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
			
			Actions act = new Actions(driver);
			
			act.dragAndDrop(drag, drop).perform();
			
		
			
			
			
	}		
}
