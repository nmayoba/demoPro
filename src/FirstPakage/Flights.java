package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launching URL
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		
		//Click on one way and this will default to Round trip
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		
		//Locate by Linktext and partiallinktext attribute
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.partialLinkText("Ho")).click();
	
		//Navigate to drop down 
		//Declare the drop-down element as an instance of the Select class
		Select drpDeparture = new Select(driver.findElement(By.name("fromPort")));
		
		drpDeparture.selectByVisibleText("London");
		
		
		//Drop down month 
		Select drpMonth = new Select(driver.findElement(By.name("fromMonth")));
		
		drpMonth.selectByVisibleText("March");
		
		//Fist class radio button 
		driver.findElement(By.xpath("//input[@value='First']")).click();
		
		
		//Click continue
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
	}
	
}
