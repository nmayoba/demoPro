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
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	
			
		//Create instance of Chrome driver
		 WebDriver d = new ChromeDriver();
		
		 String baseUrl ="https://www.monsterindia.com/seeker/registration";
		
		 d.manage().window().maximize();//always write wait code after this
//		 d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //for page load
		 d.get(baseUrl); //Testing webPage
//		 d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //for implicit wait
	

		//JavascriptExecutot js = (JavascriptExecutor)d; //Scrolling using JavascriptExecutor
		//js.executeScript ("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
    	
		
		//File Uploading using SendKeys....
		
		WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
		//Click on 'Choose file' to upload the desired file
		browse.sendKeys("C:\\autoProgram\\Notes.docx"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");
		
		
		
		
		
		
		
	}

}
