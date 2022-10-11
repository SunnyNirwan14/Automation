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

public class Screenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd_MM_yyyy  HH-mm-ss");
		LocalDateTime time = LocalDateTime.now();
		String datetime=(dtf.format(time));
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Screenshot\\Facebook\\"+datetime+".jpeg");
		FileHandler.copy(source, destination);
		
	}

}
