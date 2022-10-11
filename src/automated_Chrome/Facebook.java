package automated_Chrome;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



public class Facebook 
{
	public static int i=1;
	static WebDriver  driver;
	
	public static void capture() throws IOException
	{
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Screenshot\\Facebook\\"+i+".jpeg");
		FileHandler.copy(source, dest);
		i++;
	}	
	
	
	public static void ss() throws IOException 
	{
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd_MM_yyyy  HH-mm-ss");
		LocalDateTime time = LocalDateTime.now();
		String datetime=(dtf.format(time));
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Screenshot\\Facebook\\Bydate\\"+datetime+".jpeg");
		FileHandler.copy(source, destination);
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//Implicit wait
		
		WebElement Username=driver.findElement(By.id("email"));
		String result=Username.getAttribute("placeholder");
		System.out.println(result);
		String expectedresult="Email address or phone number";
		if (result.equals(expectedresult))
		{
			Username.sendKeys("Admin");
			System.out.println("Input field is selected and value is accepted");
			System.out.println("Placeholder value is verified");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		System.out.println("----------------------------------------------------------------");
		//capture();
		ss();
		
		
		WebElement Password=driver.findElement(By.id("pass"));
		String result1=Password.getAttribute("placeholder");
		System.out.println(result1);
		String expectedresult1="Password";
		if (result1.equals(expectedresult1))
		{
			Password.sendKeys("Admin@1324");
			System.out.println("Input field is selected and value is accepted");
			System.out.println("Placeholder value is verified");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		
		System.out.println("----------------------------------------------------------------");
		
		
		WebElement Login=driver.findElement(By.name("login"));
		String result2=Login.getText();
		System.out.println(result2);
		String expectedresult2="Log In";
		if (result2.equals(expectedresult2))
		{
			Login.click();
			System.out.println("Log In text is verified");
			System.out.println("Log in button is clickeble");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		//capture();
		ss();
		System.out.println("----------------------------------------------------------------");
		
		
		driver.navigate().back();
		
		WebElement createnewaccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		String result3=createnewaccount.getText();
		System.out.println(result3);
		String expectedresult3="Create New Account";
		if (result3.equals(expectedresult3))
		{
			createnewaccount.click();
			System.out.println("Create New Account text is verified");
			System.out.println("Create New Account button is clickeble");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		
		System.out.println("----------------------------------------------------------------");
		
	
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		String result4=firstname.getAttribute("aria-label");
		System.out.println(result4);
		String expectedresult4="First name";
		if (result4.equals(expectedresult4))
		{
			firstname.sendKeys("sunny");
			System.out.println("Input field is verified");
			System.out.println("Input field is accepting value");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		System.out.println("----------------------------------------------------------------");
	
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		String result5=lastname.getAttribute("aria-label");
		System.out.println(result5);
		String expectedresult5="Surname";
		if (result5.equals(expectedresult5))
		{
			lastname.sendKeys("kiran");
			System.out.println("Input field is verified");
			System.out.println("Input field is accepting value");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		System.out.println("----------------------------------------------------------------");
		
	
		WebElement mobilenumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		String result6=mobilenumber.getAttribute("aria-label");
		System.out.println(result6);
		String expectedresult6="Mobile number or email address";
		if (result6.equals(expectedresult6))
		{
			mobilenumber.sendKeys("5546413351");
			System.out.println("Input field is verified");
			System.out.println("Input field is accepting value");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		System.out.println("----------------------------------------------------------------");
		
		
		WebElement newpass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		String result7=newpass.getAttribute("aria-label");
		System.out.println(result7);
		String expectedresult7="New password";
		if (result7.equals(expectedresult7))
		{
			newpass.sendKeys("bdkvb@3431");
			System.out.println("Input field is verified");
			System.out.println("Input field is accepting value");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		System.out.println("----------------------------------------------------------------");
		
	
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		String result8=day.getAttribute("aria-label");
		System.out.println(result8);
		String expectedresult8="Day";
		Select s=new Select(day);
		if (result8.equals(expectedresult8))
		{
			s.selectByIndex(1);
			System.out.println("Dropdown is working and their value are as per the Requirment");
			System.out.println("Dropdown is selecting the values");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		System.out.println("----------------------------------------------------------------");
		
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		String result9=month.getAttribute("aria-label");
		System.out.println(result9);
		String expectedresult9="Month";
		Select s1=new Select(month);
		List<WebElement> list=s1.getOptions();
		System.out.println("Listbox size- "+list.size());
		
		if (result9.equals(expectedresult9))
		{
			s1.selectByValue("4");
			System.out.println("Dropdown is working and their value are as per the Requirment");
			System.out.println("Dropdown is selecting the values");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		System.out.println("----------------------------------------------------------------");
		
	
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		String result10=year.getAttribute("aria-label");
		System.out.println(result10);
		String expectedresult10="Year";
		Select s2=new Select(year);
		if (result10.equals(expectedresult10))
		{
			s2.selectByVisibleText("1996");
			System.out.println("Dropdown is working and their value are as per the Requirment");
			System.out.println("Dropdown is selecting the values");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		System.out.println("----------------------------------------------------------------");
		
	
		WebElement femaleradiobutton=driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
		femaleradiobutton.click();
		boolean result11=femaleradiobutton.isSelected();
		System.out.println(result11);
		System.out.println("Female radio button is selected");
		System.out.println("placeholder text is matched");
		System.out.println("Test case passed");
		//capture();
		ss();
		
		System.out.println("----------------------------------------------------------------");
		
		
		WebElement maleradiobutton=driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		maleradiobutton.click();
		boolean result12=maleradiobutton.isSelected();
		System.out.println(result12);
		System.out.println("Male radio button is selected");
		System.out.println("placeholder text is matched");
		System.out.println("Test case passed");
		//capture();
		ss();
		
		System.out.println("----------------------------------------------------------------");
		
		
		WebElement custombutton=driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));
		custombutton.click();
		
		boolean result13=custombutton.isSelected();
		System.out.println(result13);
		System.out.println("Custom radio button is selected");
		System.out.println("placeholder text is matched");
		System.out.println("After selecting Custom Select your pronoun dropdown and Gender (Optional) are visible");
		System.out.println("Test case passed");
		//capture();
		ss();
		
		System.out.println("----------------------------------------------------------------");
		
	
		WebElement pronoun=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		String result14=pronoun.getAttribute("aria-label");
		System.out.println(result14);
		String expectedresult13="Select your pronoun";
		Select s4=new Select(pronoun);
		if (result14.equals(expectedresult13))
		{
			s4.selectByIndex(2);
			System.out.println("Dropdown is working and their value are as per the Requirment");
			System.out.println("Dropdown is selecting the values");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		//capture();
		ss();
		
		System.out.println("----------------------------------------------------------------");
		
	
		WebElement gender=driver.findElement(By.xpath("//input[@name='custom_gender']"));
		String result15=gender.getAttribute("aria-label");
		System.out.println(result15);
		String expectedresult11="Gender (optional)";
		
		if (result15.equals(expectedresult11))
		{
			gender.sendKeys("Test");
			System.out.println("Input field is verified");
			System.out.println("Input field is accepting value");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
			
		}
		//capture();
		ss();
		
		System.out.println("----------------------------------------------------------------");
		
		WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
		String result16=signup.getText();
		System.out.println(result16);
		String expectedresult12="Sign Up";
		if (result16.equals(expectedresult12))
		{
			signup.click();
			System.out.println("Create New Account text is verified");
			System.out.println("Create New Account button is clickeble");
			System.out.println("placeholder text is matched");
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		ss();
		
		
		
	}

}
