package automated_Edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
			
			WebDriver driver=new EdgeDriver();
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			WebElement username=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			username.sendKeys("KiranNirwan");
			Thread.sleep(1000);
			
			WebElement pass=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
			pass.sendKeys("Kiran@123");
			Thread.sleep(1000);
			
			WebElement login1=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
			login1.click();
			Thread.sleep(2000);
			
			WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			close.click();
			Thread.sleep(2000);
			
			WebElement searchbar=driver.findElement(By.name("q"));
			searchbar.sendKeys("Iphone13");
			
			WebElement search=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
			search.click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			//WebElement click=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']"));
			//click.click();
			//Thread.sleep(20000);
			
			//WebElement buy=driver.findElement(By.xpath("//button[@type='button']"));
			//buy.click();
			//Thread.sleep(1000);
			
			Thread.sleep(2000);
			WebElement becomeseller=driver.findElement(By.xpath("//span[text()='Become a Seller']"));
			becomeseller.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			WebElement cart=driver.findElement(By.xpath("//span[text()='Cart']"));
			cart.click();
			Thread.sleep(2000);
			driver.navigate().back();
			
		//	WebElement topoffer=driver.findElement(By.xpath("//div[@class='xtXmba']"));
			//topoffer.click();
			//Thread.sleep(2000);
			//driver.navigate().back();
			
			
			
			
		
	}


}
