package FirstPakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tables in HTML are displayed in a structured form using rows and columns
		// <table> html tag
		// <th> header
		// <tr> table row
		// <td> columns

		// <table>
		// <tr>
		// <th>First Name</th>
		// <th>Last Name</th>
		// <th>Age</th>
		// </tr>
		// <tr>
		// <td>Jill</td>
		// <td>Ann</td>
		// <td>24</td>
		// </tr>
		// <tr>
		// <td>Eve</td>
		// <td>Anderson</td>
		// <td>34</td>
		// </tr>
		// </table>

		/*
		* First Name Last Name Age
		* Jill Ann 24
		* Eve Anderson 34
		*/

		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		
		//Create instance of Chrome driver
		WebDriver driver = new ChromeDriver(); String baseUrl ="http://demo.guru99.com/test/web-table-element.php";
		driver.get(baseUrl);
		
		///No.of Columns
		String col11 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr[1]/th[1]")).getText();
		System.out.println(col11);
		List <WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No of cols are : " +col.size());
		//No.of rows
		List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of rows are : " + rows.size());
		
		//driver.close();
		String col12 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[4]")).getText();
		System.out.println(col12);
		
		
		
		//driver.close();
		//www.guru99.com/handling-dynamic-selenium-webdriver.html
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[4]
		driver.get(baseUrl);
		WebElement mytable =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
		//WebElement mytable =driver.findElement(By.xpath("/html/body/table/tbody"));
		List <WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		//to calculate the no of rows in the table
		int row_count = rows_table.size();
		System.out.println("No of rows" + row_count);
		
		//Loop will exut till the last 
		for (int row= 0; row< row_count; row++) {
			List <WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
			System.out.println("Number of colls in row " + row + " are " + row_count); 
		//Loop will exut till the last cell of that specific row
			for (int column =0; column <row_count ; column++) {
				//to retrieve the testx form that specific cell 
				String celtext = columns_row.get(column).getText();
			}
		}
			
	}
}
		
		
		
	