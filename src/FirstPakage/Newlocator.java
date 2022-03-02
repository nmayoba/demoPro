package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newlocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//String baseUrl = "http://demoqa.com/";
		String practiceURL = "https://demoqa.com/automation-practice-form";
		String guruURL = "https://demo.guru99.com/test/newtours/";
		
		//driver.get(baseUrl);
		
		//Locate by ID Attribute
		driver.get(practiceURL);
		driver.findElement(By.id("lastName"));
				
	
				
		//Locate by ClassName Attribute
		driver.findElement(By.className("left-pannel"));
				
		//Locate by cssSelector attribute
		driver.findElement(By.cssSelector("input[id= 'firstName']"));
				
		//Locate by xpath attribute
		driver.findElement(By.xpath("//input[@id='userEmail']"));
				
		//Locate by Linktext and partiallinktext attribute
		driver.get(guruURL);
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.partialLinkText("Des")).click();
		
		
		driver.close();					
		
		
	}

}
