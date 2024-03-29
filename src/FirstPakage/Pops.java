package FirstPakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pops {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		
		//Creating instance of Chrome driver
		WebDriver driver = new ChromeDriver ();
		//setting up the explicit waits 
		WebDriverWait wait = new WebDriverWait(driver, 20);
	
		String baseURL = "http://demo.guru99.com/test/delete_customer.php";
		driver.get(baseURL);
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		WebElement wait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
		System.out.println(wait1);
		driver.findElement(By.name("cusid")).sendKeys("34234234");
		driver.findElement(By.name("submit")).submit();
		
		//switch to the alert
		Alert alert = driver.switchTo().alert();
		
		//Capturing alert message
		String alertMessage = driver.switchTo().alert().getText();
		
		//Display message on console
		System.out.println(alertMessage);
		Thread.sleep(500);
		
		//accept the alert
		alert.accept();
		alert.dismiss();
		
			
		
	}

}
