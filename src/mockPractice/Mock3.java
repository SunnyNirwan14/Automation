package mockPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryit.click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.switchTo().defaultContent();
		
		WebElement home=driver.findElement(By.xpath("//a[@title='w3schools.com Home']"));
		home.click();
		
	}

}
