package content;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown 
{
	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,800)");		//Scroll down
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)");	//Scroll up
		Thread.sleep(2000);
		
	//	js.executeScript("window.scrollBy(800,0");		//Scroll right
		//Thread.sleep(2000);
		
		//js.executeScript("window.scrollBy(-500,0)");	//Scroll left
	
		
	}

}
