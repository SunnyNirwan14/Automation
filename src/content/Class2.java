package content;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class2 
{
	//Opening edge browser

		public static void main(String[] args) throws InterruptedException 
		{
								//Webdriver keyword			//Web driver location
			
			System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe"); //java code
			
			WebDriver driver=new EdgeDriver();	//selenium code for opening browser
			
			driver.get("https://www.facebook.com");	//selenium code for opening url
			
			Thread.sleep(2000);
			
			driver.navigate().to("https://www.youtube.com");
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			String url=driver.getCurrentUrl();
			System.out.println(url);
			
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(title);
			
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			driver.manage().window().minimize();
			
			Thread.sleep(1000);
			
			Dimension d=new Dimension(800,600);
			
			driver.manage().window().setSize(d);
			
			Thread.sleep(2000);
			
			Point p=new Point(300,300);			
			driver.manage().window().setPosition(p);
			
			//driver.close();
			
			driver.quit();
			
		
		}

}
