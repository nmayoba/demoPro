package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set some variables
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		//Create the instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		// Launching URL
		driver.get("http://demo.guru99.com/test/radio.html");
		
//		//Get the element locators for the radio buttons
//		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
//		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
//		
//		//Select the radio button 1
//		radio1.click();
//		System.out.println("Radio Button Option 1 selected");
//		
//		//Select the radio button 2
//		radio1.click();
//		System.out.println("Radio Button Option 2 selected");
		
		//Toggle 
//		radio1.click();
//		System.out.println("Radio Button Option 1 selected");
//		
		
				
		
		
		
		

	}

}
