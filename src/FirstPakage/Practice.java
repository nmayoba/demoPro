package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		//Create the instance of chrome driver
		WebDriver driver = new ChromeDriver();
			
		//Launch URL
		driver.get("https://demoqa.com/automation-practice-form");
		
		//Validate isSelected and click =
		WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='checkbox-1']"));
		//WebElementcheckBoxSelected = driver.findElement(By.cssSelector("input[id='checkbox-1']"));
		boolean isSelected = checkBoxSelected.isSelected();
		
		//Perform the click operation if the element is not selected
		if(isSelected == false) {
			checkBoxSelected.click(); 
		}
		
		
	}

}
