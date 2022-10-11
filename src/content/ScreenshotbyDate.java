package content;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotbyDate  
{
	public static int i=1;
	static WebDriver  driver;
	public static void ss() throws IOException
	{
		DateTimeFormatter time = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");  
		LocalDateTime now =  LocalDateTime.now(); 
		String abc=(time.format(now));
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\New folder\\"+abc+".jpeg");
		FileHandler.copy(source, destination);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
        driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		ss();
		
	}

}

