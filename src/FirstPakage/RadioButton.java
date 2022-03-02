package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class RadioButton {

//	private static final String WebElement = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set some variable
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		//Create the instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launching URL
		driver.get("http://demo.guru99.com/test/radio.html");
		
		//get the element locator for the radio buttons
		org.openqa.selenium.WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		//Select the radio button 1
		radio1.click();
		System.out.println("Radio Button Option 1 selected");
		
		//Select the radio button 2
		radio2.click();
		System.out.println("Radio Button Option 2 selected");
		
		//Toggle
		radio1.click();
		System.out.println("Radio Button Option 1 selected");
		
		//located the option 1 check box
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		WebElement option2 = driver.findElement(By.id("vfb-6-1"));
		
		
		//check the option 1
		option1.click();
		option2.click();
		
		//check whether the check box is toggle on
		if(option1.isSelected()) {
			System.out.println("CheckBox is toggled on");
		}else {
			System.out.println("Checkbox is toggled off");
			
			
		
			
		}
		
		
		
	}

}
