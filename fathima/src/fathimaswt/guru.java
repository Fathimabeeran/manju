package fathimaswt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.findElement(By.name("emailid")).sendKeys("zain@123.com");
		driver.findElement(By.name("btnLogin")).click();
	}
	}


