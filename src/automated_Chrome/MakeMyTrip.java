package automated_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(100);
	
		WebElement hotels=driver.findElement(By.xpath("//li[@class='menu_Hotels']"));
		hotels.click();
		Thread.sleep(2000);
		
		WebElement homestays=driver.findElement(By.xpath("//li[@class='menu_Homestays']"));
		homestays.click();
		Thread.sleep(2000);
		
		WebElement holidaypackage=driver.findElement(By.xpath("//li[@data-cy='menu_Holidays']"));
		holidaypackage.click();
		Thread.sleep(2000);
		
		WebElement trains=driver.findElement(By.xpath("//li[@data-cy='menu_Trains']"));
		trains.click();
		Thread.sleep(2000);
		
		WebElement buses=driver.findElement(By.xpath("//li[@data-cy='menu_Buses']"));
		buses.click();
		Thread.sleep(2000);
		
		WebElement cabs=driver.findElement(By.xpath("//li[@data-cy='menu_Cabs']"));
		cabs.click();
		Thread.sleep(2000);
		
		WebElement forex=driver.findElement(By.xpath("//li[@data-cy='menu_Forex']"));
		forex.click();
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//li[@data-cy='account']"));
		login.click();
		Thread.sleep(2000);
				
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("helloworld@gmail.com");
		Thread.sleep(2000);
				
		WebElement Continue=driver.findElement(By.xpath("//button[@data-cy='continueBtn']"));
		//span[text()='Continue']
		Continue.click();
		Thread.sleep(2000);
				
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Admin@1234");
		Thread.sleep(1500);
				
		WebElement login1=driver.findElement(By.xpath("//button[@data-cy='login']"));
		login1.click();
		Thread.sleep(1500);
		
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(100);
		
		WebElement holidaypackage1=driver.findElement(By.xpath("//div[@data-cy='outsideModal']"));
		holidaypackage1.click();
		Thread.sleep(1000);
		
		WebElement from=driver.findElement(By.xpath("//input[@id='fromCity']"));
		//from.click();
		from.sendKeys("Nagpur");
		Thread.sleep(500);
		
		WebElement to=driver.findElement(By.xpath("//input[@id='toCity']"));
		to.click();
		Thread.sleep(500);
		to.sendKeys("London");
		
		WebElement to1=driver.findElement(By.xpath("//div[@class='calc60']"));
		Thread.sleep(500);
		to1.click();
		Thread.sleep(500);
		
		WebElement departure=driver.findElement(By.xpath("//label[@for='departure']"));
		//Thread.sleep(500);
		departure.click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@aria-label='Mon Sep 26 2022']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Tap to add a return date for bigger discounts']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@aria-label='Mon Oct 03 2022']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
	}

}
