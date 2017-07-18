import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBuilder {

static WebDriver driver;
	
	public static void main(String [] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Profile\\Desktop\\Work\\eclipse\\Selenium\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("file:\\C:\\Users\\Profile\\Desktop\\Work\\HTML\\HTML\\sortable.html");
		boolean result = true;
		
		try{
			
			//driver.findElement(By.id("sortable"));
			
			Actions builder = new Actions(driver);
			
			WebElement no6 = driver.findElement(By.xpath("//*[@id='sortable']/li[6]"));
			WebElement no7 = driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
			
			org.openqa.selenium.Point point = no6.getLocation();
			int no6X = point.getX();
			int no6Y = point.getY();
			
			org.openqa.selenium.Point no7point = no7.getLocation();
			int no7X = no7point.getX();
			int no7Y = no7point.getY();
			
			System.out.println("Original Position of 6: " + no6X + " " + no6Y);
			System.out.println("Original Position of 7: " + no7X + " " + no7Y);
			
			builder.dragAndDrop(no6, no7).build().perform();
			System.out.println("Elements Swaped");
			
			
			
		}catch (NoSuchElementException e){
			System.out.println(e);
			result = false;
		}finally{
			//driver.close();
		}
		
		if(result){
			System.out.println("---Passed---");
		}else{
			System.out.println("---Failed---");
		}
			
		
		
	}
}
