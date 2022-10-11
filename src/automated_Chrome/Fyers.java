package automated_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fyers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.fyers.in/?message=You%20have%20successfully%20logged%20out!&message_type=1");
		Thread.sleep(2000);
		
		WebElement ClientId=driver.findElement(By.id("fy_client_id"));
		ClientId.sendKeys("FK0910");
		
		WebElement Login=driver.findElement(By.id("clientIdSubmit"));
		Login.click();
		Thread.sleep(1000);
		
		WebElement Pass=driver.findElement(By.id("fy_client_pwd"));
		Pass.sendKeys("Sunny@12");
		
		WebElement Continue=driver.findElement(By.id("loginSubmit"));
		Continue.click();
		Thread.sleep(8000);
		
		WebElement Pin1=driver.findElement(By.id("//div[@id='pin-container']/input"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Pin1).click().build().perform();
		Pin1.sendKeys("1");
		
		//WebElement Pin2=driver.findElement(By.id("second"));
		//Pin2.sendKeys("9");
		
		//WebElement Pin3=driver.findElement(By.id("third"));
		//Pin3.sendKeys("9");
		
		//WebElement Pin4=driver.findElement(By.id("fourth"));
		//Pin4.sendKeys("6");
		
		//WebElement Signin=driver.findElement(By.id("verifyPinSubmit"));
		//Signin.click();
	
		
		
		
		
		
		
		
		
	}

	
}
    
