package automated_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM
{
	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		WebElement Username=driver.findElement(By.name("username"));
		Username.sendKeys("Admin");
		
		
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("admin123");
		Thread.sleep(500);
		
		WebElement Login=driver.findElement(By.xpath("//button[text()=' Login ']"));
		Login.click();
		Thread.sleep(500);
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.click();
		Thread.sleep(1000);
		
		WebElement Admin=driver.findElement(By.xpath("//span[text()='Admin']"));
		Admin.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		
		WebElement PIM=driver.findElement(By.xpath("//span[text()='PIM']"));
		PIM.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		
		WebElement Leave=driver.findElement(By.xpath("//span[text()='Leave']"));
		Leave.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		
		WebElement Time=driver.findElement(By.xpath("//span[text()='Time']"));
		Time.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		
		//WebElement Timeatt=driver.findElement(By.id("menu_attendance_Attendance"));
		//Timeatt.click();
		//Thread.sleep(1000);
		//driver.navigate().back();
		
		WebElement Recruitment=driver.findElement(By.xpath("//span[text()='Recruitment']"));
		Recruitment.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		
		WebElement Myinfo=driver.findElement(By.xpath("//span[text()='My Info']"));
		Myinfo.click();
		Thread.sleep(1000);
		
		WebElement Performance=driver.findElement(By.xpath("//span[text()='Performance']"));
		Performance.click();
		Thread.sleep(1000);
		
		WebElement Dashboard=driver.findElement(By.xpath("//span[text()='Dashboard']"));
		Dashboard.click();
		Thread.sleep(1000);
		
		WebElement Directory=driver.findElement(By.xpath("//span[text()='Directory']"));
		Directory.click();
		Thread.sleep(1000);
		
		WebElement Maintenance=driver.findElement(By.xpath("//span[text()='Maintenance']"));
		Maintenance.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		WebElement Buzz=driver.findElement(By.xpath("//span[text()='Buzz']"));
		Buzz.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		WebElement sidepanelclose=driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']"));
		sidepanelclose.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
		
		
		
		
		
		
	}

	
	
}
