package content;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop_up 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//driver.manage().window().getSize();
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		Alert alt = driver.switchTo().alert();	//to switch focus
		String text1=alt.getText();
		System.out.println(text1);
		Thread.sleep(1000);
		alt.accept();	//ok, submit,accept
		//alt.dismiss();	//cancel, dismiss
		//alt.sendKeys("");
		String text=alt.getText();
		System.out.println(text);
		
		
		
	}

}
