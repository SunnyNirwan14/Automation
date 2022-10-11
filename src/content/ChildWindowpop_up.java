package content;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowpop_up 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//WebElement Alert = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[1]"));
		
		//WebElement Confirm = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[2]"));
		
		//WebElement Prompt = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[3]"));
		
		//WebElement LineBreaks = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[4]"));
		
		List<WebElement> button=driver.findElements(By.xpath("//a[contains(text(),'Try it Yourself')]"));	//multiple matching can save in findElements method
		
		
	//	Alert.click();
	//	Thread.sleep(1000);
	//	Confirm.click();
	//	Thread.sleep(1000);
	//	Prompt.click();
	//	Thread.sleep(1000);
	//	LineBreaks.click();
		
		for (int a=0; a<button.size(); a++)
		{
			button.get(a).click();
		
		}
		
		
		String main = driver.getWindowHandle();		//address of main window
		System.out.println("Main: "+main);
		
		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());		//address of all window tab
		
		for (int b=0; b<addrs.size(); b++)
		{
		System.out.println(addrs.get(b));	//main tab address
		
		//System.out.println(addrs.get(1));	//4 child window add
		//System.out.println(addrs.get(2));	//3 child window add
		//System.out.println(addrs.get(3));	//2 child window add
		//System.out.println(addrs.get(4));	//1 child window add
		}
		
		for (int i=1; i<addrs.size(); i++)
		{
			driver.switchTo().window(addrs.get(i));		//on 1st index last tab address get save /address save in descending order
			String url=driver.getCurrentUrl();			//but main window address save at 0 index
			System.out.println("Index "+i+": "+url);
			Thread.sleep(1000);
		}
		
	
		
		
		
	}
}
