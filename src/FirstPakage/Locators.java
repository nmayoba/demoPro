package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators extends FierstPakage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String baseUrl ="http://demoqa.com/";
		String practiceUrl = "httpps://demoqa.com/automation-practice-form";
		String guruUrl = "httpps://demo.guru99.com/test/newtours/";
		
		//driver.get(baseUrl);
		
		//Locate by ID Attribute 
		driver.get(practiceUrl);
		driver.findElement(By.id("firstName"));
		
		//Locate by Name Attribute 
		driver.findElement(By.name("gender"));
		
		//Locate by ClassName Attribute 
		
		
		// locate using class
		driver.findElement(By.className("practice-form-wrapper"));
		
		//locate using css selector
		driver.findElement(By.cssSelector("input[id='userEmail']"));
		
		//locate using xpath
		driver.findElement(By.xpath("//input[@id='firstName']"));
		
		//locate using link text
		driver.get(guruUrl);
		driver.findElement(By.linkText("SUPPORT"));
		driver.findElement(By.partialLinkText("SUP"));
		driver.close();


		
		
		
	}

}
