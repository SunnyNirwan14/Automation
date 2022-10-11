package automated_Chrome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			WebElement username=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			WebElement username1=driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']"));
			boolean v1=username.isDisplayed();
			String result=username1.getText();
			String expectedresult="Enter Email/Mobile number";
			System.out.println(result);
			if (v1==true)
			{ if (result.equals(expectedresult))
				{
					username.sendKeys("KiranNirwan");
					System.out.println("Placeholder value is verified");
					System.out.println("Username Tab is accepting values ");
					System.out.println("Test case is passed");
				}
			}
			else
			{
				System.out.println("Test case failed");
			}
		
			System.out.println("---------------------------------------------------------");
			
			WebElement pass=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
			WebElement pass1=driver.findElement(By.xpath("//span[text()='Enter Password']"));
			boolean v2=pass.isDisplayed();
			String result1=pass1.getText();
			String expectedresult1="Enter Password";
			System.out.println(result1);
			if (v2==true)
			{
				if (result1.equals(expectedresult1))
				{
					pass.sendKeys("Kiran@123");
					System.out.println("Placeholder value is verified");
					System.out.println("Password Tab is accepting values ");
					System.out.println("Test case is passed");
				}
			}
			else
			{
				System.out.println("Test case failed");
			}
			System.out.println("---------------------------------------------------------");
			
		
			WebElement login1=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
			WebElement login12=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']//span"));
			boolean v3=login1.isEnabled();
			String result2=login12.getText();
			String expectedresult2="Login";
			System.out.println(result2);
			if (v3==true)
			{
				if (result2.equals(expectedresult2))
				{
					login1.click();
					System.out.println("Login button is enabled");
					System.out.println("Log In text is matched");
					System.out.println("Button is clickable");
					System.out.println("Test case is passed");
					
				}
			}
			else
			{
				System.out.println("Test case is failed");
			}
			
			
			
			WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			close.click();
			
			
			WebElement searchbar=driver.findElement(By.name("q"));
			searchbar.sendKeys("Iphone13");
			
			WebElement search=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
			search.click();
			
			driver.navigate().back();
			
			//WebElement click=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']"));
			//click.click();
			//Thread.sleep(20000);
			
			//WebElement buy=driver.findElement(By.xpath("//button[@type='button']"));
			//buy.click();
			//Thread.sleep(1000);
			
			
			WebElement becomeseller=driver.findElement(By.xpath("//span[text()='Become a Seller']"));
			becomeseller.click();
		
			driver.navigate().back();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement cart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Cart']")));
			
			
		//	WebElement cart=driver.findElement(By.xpath("//span[text()='Cart']"));
			cart.click();
			
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().forward();
		//	WebElement topoffer=driver.findElement(By.xpath("//div[@class='xtXmba']"));
		//	topoffer.click();
		//	Thread.sleep(2000);
		//	driver.navigate().back();
			
			//driver.manage().window().minimize();
			
			
		
	}

}
