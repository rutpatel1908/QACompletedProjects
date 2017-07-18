
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.Set;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CookieTesting {

	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Profile\\Desktop\\Work\\eclipse\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mouseprice.com/login");
		final String userName = "elitewarrior1908@gmail.com";
		final String password = "rutpatel1010";

		WebElement usernameBox = driver.findElement(By.id("txtEmail"));
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		WebElement saveBtn = driver.findElement(By.id("cmdLogin"));

		usernameBox.sendKeys(userName);
		passwordBox.sendKeys(password);
		saveBtn.click();

		// create a wait with a timeout of 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, 5);
		boolean testElement = false;
		
		try {
			System.out.println("Searching...");
			testElement = wait
					.until(ExpectedConditions.textToBePresentInElementLocated(
							By.id("A1"),"Logout"));
			
		} catch (Exception e) {
			e.printStackTrace();
			testElement = false;
		}

		if (testElement){
			System.out.println("Passed");
			System.out.println("You have logged in successfully");
		
		}else{
			System.out.println("Failed");
		}

		
		
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		
		driver.findElement(By.xpath("//*[@id='A1']")).click();
		System.out.println("You have logged out successfully");

		
		driver.get("https://www.mouseprice.com/");
		
		for(Cookie ck:cookiesList){
		driver.manage().addCookie(ck);
		}
				
		driver.get("https://www.mouseprice.com/");
		    
		try {
			System.out.println("Searching for logout button...");
			testElement = wait.until(ExpectedConditions.textToBePresentInElementLocated(
						By.id("A1"),"Logout"));
		} catch (Exception e) {
			e.printStackTrace();
			testElement = false;
		}

		if (testElement)
			System.out.println("Passed----User logged in successfully!");
		else
			System.out.println("Failed----User didn't log in!");
		    
		//driver.close();
		//System.exit(0);
		
		
	}
}
