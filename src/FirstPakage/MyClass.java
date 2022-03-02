package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration and instantiation of objects and variables
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		
		
		
		String baseUrl = "https://https://demo.guru99.com/V4/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		
		//Navigate to baseUrl 
		driver.get(baseUrl);
		
		//get the actual value of the title 
		actualTitle = driver.getTitle();
		
		/*
		 *compare the actual title of then page with the expected one and print
		 *the results as "Passed" or "failed"
		 */
		if (actualTitle.contentEquals(expectedTitle )) {
			System.out.println("Test passed");
		}else {
			System.out.println("failed");
		}
		
		//close
		driver.close();
		
		//play 
		driver.findElement(By.id("firstName"));
		driver.findElements(By.name("gender"));
		driver.findElement(By.className("practice-form-wrapper"));
		driver.findElement(By.linkText("SUPPORT"));
		driver.findElement(By.partialLinkText("SU"));
		driver.findElement(By.tagName("a"));
		driver.findElement(By.cssSelector("input[id='userName']"));
		driver.findElement(By.xpath("//input[@id= 'userName']"));
		
		
				
		
		}
		
		
	}


