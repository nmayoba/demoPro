package FirstPakage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		//Create the instance of Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launching URL
		driver.get("https://demoqa.com/select-menu");
		
		//Maximizing the window
		driver.manage().window().maximize();
				
		//Select the drop down element by locating it 's id
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//print the options of the drop down
		List<WebElement>lst=select.getOptions();
		
		//Looping through the options and printing drop down options
		System.out.println("The dropdown options are");
		for(WebElement options:lst)
			System.out.println(options.getText());
		
		//select the option as purple index
		select.selectByIndex(4);
		System.out.println("Selected value is: " + select.getFirstSelectedOption().getText());
		
		//select the option as Magenta using visible text
		select.selectByVisibleText("Magenta");
		System.out.println("Select colour is: " + select.getFirstSelectedOption().getText());
				
	}

	
		
	}


