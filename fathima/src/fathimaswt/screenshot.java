package fathimaswt;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public void findscreenShot()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshot, new File("C:\\Users\\nihal\\Desktop\\Fathima\\scw.jpeg"));
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
	}

	

	public static void main(String[] args) {
		
screenshot obj=new screenshot();
obj.findscreenShot();
	}

}
