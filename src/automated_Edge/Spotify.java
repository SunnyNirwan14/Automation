package automated_Edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Spotify 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
			
			WebDriver driver=new EdgeDriver();
			
			driver.get("https://open.spotify.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			WebElement login=driver.findElement(By.xpath("//span[text()='Log in']"));
			login.click();
			Thread.sleep(2000);
			
			WebElement username=driver.findElement(By.id("login-username"));
			username.sendKeys("Admin");
		
			WebElement pass=driver.findElement(By.id("login-password"));
			pass.sendKeys("Sunny@123");
			Thread.sleep(2000);
			
			WebElement login1=driver.findElement(By.xpath("//p[text()='Log In']"));
			login1.click();
			Thread.sleep(2000);
			
			WebElement facebook=driver.findElement(By.xpath("//button[@data-testid='facebook-login']"));
			facebook.click();
			Thread.sleep(1000);
			
			WebElement email=driver.findElement(By.name("email"));
			email.sendKeys("kiran");
			
			WebElement pass1=driver.findElement(By.name("pass"));
			pass1.sendKeys("Admin@123");
			
			WebElement login2=driver.findElement(By.id("loginbutton"));
			login2.click();
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(1000);
			
			WebElement login3=driver.findElement(By.xpath("//span[text()='Log in']"));
			login3.click();
			Thread.sleep(1000);
			
			WebElement login4=driver.findElement(By.xpath("//button[@data-testid='apple-login']"));
			login4.click();
			Thread.sleep(1000);
			
			WebElement login5=driver.findElement(By.id("account_name_text_field"));
			login5.sendKeys("Admin1234");
			
			WebElement enter=driver.findElement(By.xpath("//i[@class='shared-icon icon_sign_in']"));
			enter.click();	
			Thread.sleep(3000);
			
			WebElement login6=driver.findElement(By.id("password_text_field"));
			login6.sendKeys("asn@1234");
			
			WebElement enter1=driver.findElement(By.xpath("//i[@class='shared-icon icon_sign_in']"));
			enter1.click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			WebElement login7=driver.findElement(By.xpath("//span[text()='Log in']"));
			login7.click();
			Thread.sleep(1000);
			
			WebElement google=driver.findElement(By.xpath("//button[@data-testid='google-login']"));
			google.click();
			Thread.sleep(1000);
			
			WebElement googleusername=driver.findElement(By.xpath("//input[@type='email']"));
			googleusername.sendKeys("kirannirwan");
			
			WebElement googlenext=driver.findElement(By.xpath("//span[text()='Next']"));
			googlenext.click();
			Thread.sleep(3000);
			driver.navigate().back();
			driver.navigate().back();
			
			WebElement login8=driver.findElement(By.xpath("//span[text()='Log in']"));
			login8.click();
			Thread.sleep(1000);
			
			WebElement phone=driver.findElement(By.xpath("//button[@data-testid='phone-login']"));
			phone.click();
			Thread.sleep(1000);
			
			WebElement phonenumber=driver.findElement(By.id("phonelogin-phonenumber"));
			phonenumber.sendKeys("5661664489");
			
			WebElement phone1=driver.findElement(By.xpath("//p[text()='Next']"));
			phone1.click();
			Thread.sleep(1000);
			
			WebElement otp=driver.findElement(By.id("phonelogin-code"));
			otp.sendKeys("123456");
			Thread.sleep(1000);
			
			WebElement phone2=driver.findElement(By.xpath("//p[text()='Next']"));
			phone2.click();
			Thread.sleep(3000);
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(1000);
			
			WebElement search=driver.findElement(By.xpath("//span[text()='Search']"));
			search.click();
			Thread.sleep(5000);
			//driver.navigate().back();
			
			WebElement search1=driver.findElement(By.xpath("//input[@maxlength='800']"));
			search1.sendKeys("Kesariya From Brahmastra");
			Thread.sleep(2000);
			
			WebElement click=driver.findElement(By.xpath("//div[text()='Kesariya (From \"Brahmastra\")']"));
			click.click();
			Thread.sleep(2000);
			
			WebElement library=driver.findElement(By.xpath("//span[text()='Your Library']"));
			library.click();
			Thread.sleep(2000);
			
			WebElement notnow=driver.findElement(By.xpath("//button[text()='Not now']"));
			notnow.click();
			Thread.sleep(2000);
			
			WebElement home=driver.findElement(By.xpath("//span[text()='Home']"));
			home.click();
			
			
			
			
			
			
			
			
	}

}
