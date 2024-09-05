package testngprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testngprgram1 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Users\\nihal\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver:
		
  @Test
  public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Asset.assertEquals(actualTitle, expectedTitle);
  }
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("LAUNCHING CHROME DRIVER BROWSER");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver=new ChromeDriver();
	  driver.get(baseUrl);
  }

  @AfterTest
  public void TerminateBrowser() {
	  driver.close();
  }

}
