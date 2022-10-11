package automated_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		Thread.sleep(2000);
		
		WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		signin.click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kirannirwan@gmail.com");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='First and last name']")).sendKeys("Kiran Nirwan");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("1234567890");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//input[@placeholder='At least 6 characters']")).sendKeys("Sunny@123");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(9000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 13 green");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Green']")).click();
		//Thread.sleep(5000);
		//driver.close();
		
		WebElement radiobutton=driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
		radiobutton.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Clear']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Clear']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='See All 4 Departments']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='nav-logo']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("441302");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[8]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[9]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[10]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[11]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@title='Search in']/option[11]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Rich dad poor dad");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
