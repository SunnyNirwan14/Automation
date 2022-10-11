package content;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowpop_up2 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		//driver.switchTo().frame(1);				//by iframe sequence number starting from 0
		driver.switchTo().frame("iframeResult");	//by name/id attribute value
		//driver.switchTo().frame("iframe");		//by webelement as argument
		
		
		//driver.switchTo().parentFrame();	//to switch on immediate parent frame
		
		//driver.switchTo().defaultContent(); //to switch on main page
		
		
		Thread.sleep(5000);
		WebElement trybutton=driver.findElement(By.xpath("//button[text()='Try it']"));
		trybutton.click();
		Thread.sleep(2000);
		
		Alert ok=driver.switchTo().alert();
		ok.accept();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		WebElement home = driver.findElement(By.xpath("//a[@title='w3schools.com Home']"));
		home.click();
		Thread.sleep(1000);
		
		ArrayList<String> next=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(next.get(1));
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//a[@id='w3loginbtn']"));
		login.click();
		
		
	}

}
