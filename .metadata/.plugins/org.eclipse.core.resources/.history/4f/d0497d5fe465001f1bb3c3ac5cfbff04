package fathimaswt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countthelink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homepage="https://www.facebook.com/login/";
		driver.get(homepage);
		System.out.println("TOTAL LINK COUNT" +driver.findElements(By.tagName("a")).size());
		WebElement foot=driver.findElement(By.id("pageFooter"));
		System.out.println("TOTAL LINK IN FOOTER IS" +driver.findElements(By.tagName("a")).size());
		
	}

}
