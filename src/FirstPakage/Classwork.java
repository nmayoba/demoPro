package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/login.html";
		String siteTitle = "Login pape";
		String returnedTitle = "";
		
		//Navigate to URL
		driver.get(baseURL);
		
		//get the actual value of the title
		String actualTitle = driver.getTitle();
		
		System.out.println("The page title is : " + actualTitle);
		
		
		//compare title returned is the site title
		 if (siteTitle.contentEquals(returnedTitle)){
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		 
		 //Enter email address and password
		 driver.findElement(By.id("email)")).sendKeys("nmayoba@gmail.com");;
		 driver.findElement(By.name("passwd")).sendKeys("12345678");
		 
		 //Click on sign in button
		 driver.findElement(By.name("SubmitLogin")).submit();
		 
		 //Varify if user is successfully logged in using ClassName
		 driver.findElement(By.className("error-copy"));
		 
		 System.out.println("Log in test passed");
		 driver.close();
	}
		
	
}

