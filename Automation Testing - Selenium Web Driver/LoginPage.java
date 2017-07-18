import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
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

		if (testElement)
			System.out.println("Passed");
		else
			System.out.println("Failed");

		driver.close();
		System.exit(0);
	}
}