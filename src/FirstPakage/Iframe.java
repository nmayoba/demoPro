package FirstPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		//Creating instance of Chrome
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		int totalbefore=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println("Total images before switch " +totalbefore);
		driver.switchTo().frame("a077aa5e"); //switching the frame by ID
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println("Total images after switch " +total);
		
		
	   int sizeOfIframe = driver.findElements(By.tagName("iframe")).size();
	   System.out.println("sizeOfIframe");
	   
	   for(int i=0; i<=sizeOfIframe; i++) {
		   driver.switchTo().frame(i);
		   System.out.println("index id " +i);
		   int totalImages=driver.findElements(By.xpath("html/body/a/img")).size();
		   System.out.println("total images " +totalImages);
		   	driver.switchTo().defaultContent();
	   }
		
		
	}

}
