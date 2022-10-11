package automated_Edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class OrangeHRM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(2000);
		
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.sendKeys("Admin");
		
		
		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");
		
		WebElement Login=driver.findElement(By.className("button"));
		Login.click();
		Thread.sleep(500);
		
		WebElement Admin=driver.findElement(By.className("firstLevelMenu"));
		Admin.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
		PIM.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//WebElement Leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
		//Leave.click();
		//Thread.sleep(1000);
		//driver.navigate().back();
		
		WebElement Time=driver.findElement(By.id("menu_time_viewTimeModule"));
		Time.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//WebElement Timeatt=driver.findElement(By.id("menu_attendance_Attendance"));
		//Timeatt.click();
		//Thread.sleep(1000);
		//driver.navigate().back();
		
		WebElement Recruitment=driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
		Recruitment.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		WebElement Myinfo=driver.findElement(By.id("menu_pim_viewMyDetails"));
		Myinfo.click();
		Thread.sleep(1000);
	}


}
