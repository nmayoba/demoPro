package FirstPakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDoc {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
//	
//		String baseURL = "http://demo.guru99.com/test/delete_customer.php";
//		WebDriver d = new ChromeDriver();
		
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		
		//Create instance of Chrome driver
		WebDriver d = new ChromeDriver(); String baseUrl ="http://demo.guru99.com/test/delete_customer.php";
		d.get(baseUrl);
		
		
		d.manage().window().maximize();//always write wait code after this 
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//for page load
	//	d.get(baseURL);//Testing webpage
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//for Implicit wait
		
		d.findElement(By.name("cusid")).sendKeys("34234234");
		d.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(3000);
		
		
		
		//JavascriptExecutot js = (JavascriptExecutor)d; //Scrolling using JavascriptExecutor
		//js.executeScript ("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
//		Thread.sleep(3000);
		
		//File Ulpading using Sendkeys....
		
		WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
		
		//Clock on 'Choose file' to upload the desired file
		browse.sendKeys("C:\\autoProgram\\Notes.docx"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");
		
		
		
		
		
		
		
	}

}
