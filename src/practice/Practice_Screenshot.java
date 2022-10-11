package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice_Screenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:\\www.amazon.in");
		Thread.sleep(1000);
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd_MM_yyyy  HH_mm_ss");
		LocalDateTime now= LocalDateTime.now();
		String datetime=(dtf.format(now));
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SUNNY\\Desktop\\New folder\\"+datetime+".jpg");
		FileHandler.copy(source, dest);
		
	}

}
