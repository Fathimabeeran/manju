package fathimaswt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.id("email")).sendKeys("fath");
	driver.findElement(By.id("pass")).sendKeys("ima");
	driver.findElement(By.id("loginbutton")).click();
	}
	}
