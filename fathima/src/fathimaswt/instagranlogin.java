package fathimaswt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagranlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.name("username")).sendKeys("zain");
		driver.findElement(By.name("password")).sendKeys("a21@21");
		driver.findElement(By.name("loginbutton")).click();
	}

}
