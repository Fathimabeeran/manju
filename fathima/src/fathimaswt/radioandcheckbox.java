package fathimaswt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioandcheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");

		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
		
		radio1.click();
		System.out.println("Radio Button Option 1 is selected");
		
		radio2.click();
		System.out.println("Radio Button 2 is selected");
		
		radio3.click();
		System.out.println("Radio button 3 is selected");
		
		{
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		if (option1.isSelected()) 
		{
		System.out.println("checkbox is toggled on");
	}
		else
		{
			System.out.println("Checkbox is toggled off");
		}
		}
}
}
