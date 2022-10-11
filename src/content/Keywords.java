package content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Keywords 
{
	public static void main(String[] args) 
	{
		//following sibling
		WebElement femaleradiobutton=driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
		
		//preceding sibling
		WebElement femaleradiobutton=driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input"));
		
		//parent
		WebElement femaleradiobutton=driver.findElement(By.xpath("//label[text()='Female']/parent::input"));
		
		//and
		WebElement femaleradiobutton=driver.findElement(By.xpath("//label[text()='Female']/and::input"));
		
		//or
		WebElement femaleradiobutton=driver.findElement(By.xpath("//label[text()='Female']/or::input"));
		
		
	}

}
