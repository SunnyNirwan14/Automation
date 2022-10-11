package content;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	//Opening Chrome browser

	public static void main(String[] args) throws InterruptedException 
	{
							//Webdriver keyword			//Web driver location
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); //java code
		
		WebDriver driver=new ChromeDriver();	//selenium code for opening browser
		
		driver.get("https://www.instagram.com");	//selenium code for opening url only
		
		driver.navigate().to("https://www.youtube.com");	//Selenium code for opening url and perform different operations
		
		Thread.sleep(2000);						//used for take pause
		driver.navigate().back();				//to perform back navigation
		
		Thread.sleep(2000);
		driver.navigate().forward();			//to perform forward navigation
		
		Thread.sleep(2002);
		driver.navigate().refresh();			//to perform refresh option
		
		String URL=driver.getCurrentUrl();		//to check the url of current site and have to stored in the string
		System.out.println(URL);
		
		Thread.sleep(2000);
		
		String Title=driver.getTitle();			//to check the title in the tab and stored them in string
		System.out.println(Title);
		
		driver.manage().window().maximize();	//this method used to maximize the the browser
		//method chaining
		Thread.sleep(2000);
		
		driver.manage().window().minimize();	//this method used to minimize the browser
		//minimize available after selenium 4.0
		
		Thread.sleep(1500);
		Dimension d=new Dimension(900,500);		//this object is created for manually decide the size of browser
							//(Windth,Height)
		
		driver.manage().window().setSize(d);	//with the help of this method we can decide the size of browser
		
		Thread.sleep(2000);
		
		Point p=new Point(200,300);			//Point object which used to change the position of browser as per x,y axis
		
		driver.manage().window().setPosition(p);	//setPosition are method of window interface
		
		//driver.close();		//close method is used to closed current tab which is open by selenium
		
		driver.quit();		//quit method is used to closed the browser
		
		
		
	}

}
