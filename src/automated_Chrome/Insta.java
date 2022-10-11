package automated_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		
		WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
		Username.click();
		String result=Username.getAttribute("aria-label");
		System.out.println(result);
		String expectedresult="Phone number, username, or email";
		boolean visible=Username.isDisplayed();
		if (visible==true)
		{
		if (result.equals(expectedresult))
		{
			Username.sendKeys("Admin");
			System.out.println("Placeholder is verified");
			System.out.println("Input Tab is accepting values ");
			System.out.println("Test case is passed");
		}
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		Thread.sleep(1000);
		
		System.out.println("----------------------------------------------------");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.click();
		String result1=password.getAttribute("aria-label");
		System.out.println(result1);
		String expectedresult1="Password";
		boolean visible2=password.isDisplayed();
		if (visible2==true)
		{
			if (result1.equals(expectedresult1))
			{
				password.sendKeys("Admin@121");
				System.out.println("Placeholder is verified");
				System.out.println("Input Tab is accepting values ");
				System.out.println("Test case is passed");
			}
		}
		else
		{
			System.out.println("Test case is failed");
		}
		Thread.sleep(1000);
		
		System.out.println("----------------------------------------------------");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		boolean visible3=login.isEnabled();
		System.out.println(visible3);
		String result3=login.getText();
		System.out.println(result3);
		String expectedresult3="Log In";
		if (result3.equals(expectedresult3))
		{
			if (visible3==true)
			{
				System.out.println("Login button is enabled");
				System.out.println("Log In text is matched");
				login.click();
				System.out.println("Button is clickable");
				System.out.println("Test case is passed");
			}
		}
		else
		{
			System.out.println("Button is disabled");
		}
		Thread.sleep(1000);
		
		System.out.println("----------------------------------------------------");
		
		WebElement signup=driver.findElement(By.xpath("//a[@data-testid='sign-up-link']"));
		boolean visible4=signup.isEnabled();
		String result4=signup.getText();
		System.out.println(result4);
		String expectedresult4="Sign up";
		if (visible4==true)
		{
			if (result4.equals(expectedresult4))
			{
				signup.click();
				System.out.println("Sign up botton is enabled");
				System.out.println("Sign up text is matched");
				System.out.println("Button is clickable");
				System.out.println("Test case is passed");
			}
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		System.out.println("----------------------------------------------------");
		
		Thread.sleep(1000);
		WebElement mobilenumber=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		String result5=mobilenumber.getAttribute("aria-label");
		System.out.println(result5);
		String expectedresult5="Mobile Number or Email";
		boolean visible5=mobilenumber.isDisplayed();
		if (visible5==true)
		{
			if (result5.equals(expectedresult5))
			{
				mobilenumber.sendKeys("7985641312");
				System.out.println("placeholder value is matched");
				System.out.println("Input tab is accepting value");
				System.out.println("Test case is passed");
			}
		}	
		else
		{
			System.out.println("Test case is failed");
		}
		
		System.out.println("----------------------------------------------------");
		
		Thread.sleep(1000);
		WebElement fullname=driver.findElement(By.xpath("//input[@name='fullName']"));
		String result6=fullname.getAttribute("aria-label");
		String expectedresult6="Full Name";
		System.out.println(result6);
		boolean visible6=fullname.isDisplayed();
		if (visible6==true)
		{
			if (result6.equals(expectedresult6))
			{
				fullname.sendKeys("Kiran Nirwan");
				System.out.println("placeholder value is matched");
				System.out.println("Input tab is accepting value");
				System.out.println("Test case is passed");
			}
		}	
		else
		{
			System.out.println("Test case is failed");
		}
		
		System.out.println("----------------------------------------------------");
		
		Thread.sleep(1000);
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		String result7=username.getAttribute("aria-label");
		System.out.println(result7);
		String expectedresult7="Username";
		boolean visible7=username.isDisplayed();
		if (visible7==true)
		{
			if (result7.equals(expectedresult7))
			{
				username.sendKeys("abcdefghij@45613");
				System.out.println("placeholder value is matched");
				System.out.println("Input tab is accepting value");
				System.out.println("Test case is passed");
			}
		}	
		else
		{
			System.out.println("Test case is failed");
		}
		
		System.out.println("----------------------------------------------------");
		
		Thread.sleep(1000);
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		String result8=Password.getAttribute("aria-label");
		System.out.println(result8);
		String expectedresult8="Password";
		boolean visible8=Password.isDisplayed();
		if (visible8==true)
		{
			if (result8.equals(expectedresult8))
			{
				Password.sendKeys("KiranNirwan@45613");
				System.out.println("placeholder value is matched");
				System.out.println("Input tab is accepting value");
				System.out.println("Test case is passed");
			}
		}	
		else
		{
			System.out.println("Test case is failed");
		}
		
		System.out.println("----------------------------------------------------");
		
		Thread.sleep(1000);
		WebElement Signup=driver.findElement(By.xpath("//button[text()='Sign up']"));
		String result9=Signup.getText();
		boolean visible9=Signup.isEnabled();
		System.out.println(result9);
		String expectedresult9="Sign up";
		if (visible9==true)
		{
			if (result9.equals(expectedresult9))
			{
				Signup.click();
				System.out.println("Sign up text is matched");
				System.out.println("Button is clickeble");
				System.out.println("Test case is passed");
			}
		}	
		else
		{
			System.out.println("Test case is failed");
		}
		
		
		
		
		
		
		
}
}
