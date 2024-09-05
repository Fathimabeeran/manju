package fathimaswt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://jsbin.com/usidix/1");
	String alertMessage = "";
	driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	alertMessage = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	
	System.out.println(alertMessage);
	
	driver.close();
	}
}
