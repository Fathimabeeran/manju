package fathimaswt;

		
		import java.io.File;
		import java.io.IOException;
		import java.net.HttpURLConnection;
		import java.net.MalformedURLException;
		import java.net.URL;
		import java.util.Iterator;
		import java.util.List;
		import java.util.Set;

		import javax.net.ssl.HttpsURLConnection;

		import org.openqa.selenium.By;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.io.FileHandler;

		public class Combined {

		    public static void main(String[] args) {
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SWT\\Desktop\\sele\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();

		        Combined obj = new Combined();
		        
		        // Run the individual tasks
		        obj.checkBrokenLinks(driver);
		        obj.dragAndDrop(driver);
		        obj.countLinks(driver);
		        obj.verifyTitle(driver);
		        obj.takeScreenshot(driver);
		        obj.loginToFacebook(driver);
		        obj.handleMultipleWindows(driver);
		        obj.handlePopupMessage(driver);
		        obj.radioButtonAndCheckbox(driver);
		        
		        // Close the driver
		        driver.quit();
		    }

		    @SuppressWarnings("deprecation")
			public void checkBrokenLinks(WebDriver driver) {
		        String homepage = "https://www.facebook.com/login/";
		        String url = null;
		        HttpsURLConnection huc = null;
		        int respCode = 200;

		        driver.get(homepage);
		        List<WebElement> links = driver.findElements(By.tagName("a"));
		        Iterator<WebElement> it = links.iterator();

		        while (it.hasNext()) {
		            url = it.next().getAttribute("href");

		            if (url == null || url.isEmpty()) {
		                System.out.println("URL is not configured or it's empty");
		                continue;
		            }

		            if (!url.startsWith(homepage)) {
		                System.out.println("URL belongs to another domain");
		                continue;
		            }

		            try {
		                huc = (HttpsURLConnection) (new URL(url).openConnection());
		                huc.setRequestMethod("HEAD");
		                huc.connect();
		                respCode = huc.getResponseCode();

		                if (respCode >= 400) {
		                    System.out.println(url + " is a broken link");
		                } else {
		                    System.out.println(url + " is a valid link");
		                }
		            } catch (MalformedURLException e) {
		                e.printStackTrace();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }

		    public void dragAndDrop(WebDriver driver) {
		        driver.get("https://demo.guru99.com/test/drag_drop.html");

		        WebElement from = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		        WebElement to = driver.findElement(By.xpath("//*[@id='bank']/li"));
		        Actions act = new Actions(driver);
		        act.dragAndDrop(from, to).build().perform();

		        WebElement from1 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		        WebElement to1 = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		        act.dragAndDrop(from1, to1).build().perform();
		    }

		    public void countLinks(WebDriver driver) {
		        driver.get("https://www.facebook.com/login/");

		        System.out.println("Total link count: " + driver.findElements(By.tagName("a")).size());
		        WebElement footer = driver.findElement(By.id("pageFooter"));
		        System.out.println("Total links in footer: " + footer.findElements(By.tagName("a")).size());
		    }

		    public void verifyTitle(WebDriver driver) {
		        driver.get("https://www.facebook.com/login/");

		        String expected = "Log in to Facebook";
		        String actual = driver.getTitle();

		        if (expected.contentEquals(actual)) {
		            System.out.println("Test case passed");
		        } else {
		            System.out.println("Test case failed");
		        }
		    }

		    public void takeScreenshot(WebDriver driver) {
		        try {
		            driver.get("https://www.facebook.com/login/");

		            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		            FileHandler.copy(screenshot, new File("C:\\Users\\SWT\\Desktop\\manjuswt\\abc.jpeg"));
		            System.out.println("Screenshot taken");
		        } catch (Exception e) {
		            System.out.println(e);
		        }
		    }

		    public void loginToFacebook(WebDriver driver) {
		        try {
		            driver.get("https://www.facebook.com/login/");

		            driver.findElement(By.id("email")).sendKeys("ytrfyhhjg");
		            driver.findElement(By.id("pass")).sendKeys("2435");
		            driver.findElement(By.id("loginbutton")).click();
		        } catch (Exception exp) {
		            System.out.println(exp);
		        }
		    }

		    public void handleMultipleWindows(WebDriver driver) {
		        try {
		            driver.get("https://www.facebook.com/login/");
		            driver.findElement(By.linkText("Forgotten account?")).click();

		            Set<String> handles = driver.getWindowHandles();
		            Iterator<String> it = handles.iterator();
		            while (it.hasNext()) {
		                String childWindow = it.next();
		                driver.switchTo().window(childWindow);
		            }
		        } catch (Exception e) {
		            System.out.println(e);
		        }
		    }

		    public void handlePopupMessage(WebDriver driver) {
		        driver.get("http://jsbin.com/usidix/1");

		        driver.findElement(By.cssSelector("input[value='Go!']")).click();
		        String alertMessage = driver.switchTo().alert().getText();
		        driver.switchTo().alert().accept();
		        System.out.println(alertMessage);
		    }

		    public void radioButtonAndCheckbox(WebDriver driver) {
		        driver.get("http://demo.guru99.com/test/radio.html");

		        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		        
		        // Radio Button 1 is selected
		        radio1.click();
		        System.out.println("Radio Button Option 1 Selected");

		        // Radio Button 1 is deselected and Radio Button 2 is selected
		        radio2.click();
		        System.out.println("Radio Button Option 2 Selected");

		        // Selecting CheckBox
		        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		        
		        // This will Toggle the Checkbox
		        option1.click();

		        // Check whether the Checkbox is toggled on
		        if (option1.isSelected()) {
		            System.out.println("Checkbox is Toggled On");
		        } else {
		            System.out.println("Checkbox is Toggled Off");
		        }
		    }
		}
	

		