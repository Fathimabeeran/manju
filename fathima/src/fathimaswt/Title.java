package fathimaswt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
	System.out.println("Title is "+driver.getTitle());
	String expected="Log on to Facebook";
	String actual=driver.getTitle();
	if(expected.contentEquals(actual))
	{
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	}

}
