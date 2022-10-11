package mockPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mock1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.youtube.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2200);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		Dimension d=new Dimension(700,600);
		
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
	}

}
