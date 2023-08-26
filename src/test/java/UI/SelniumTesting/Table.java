package UI.SelniumTesting;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table {
	public static void main(String[] args) {
		//Access the table get all details of user name joe.Root
		/*In html indicate   table : tagname , 
		 *    row = tr ,  *    column table header = th ,  *    cell = td */ 
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//number of row
		List<WebElement> row = driver.findElements(By.xpath("//*[@id ='resultTable']/tbody/tr"));
		System.out.println("Number of Row in table: " +row.size());
		//number of column
		List<WebElement> column = driver.findElements(By.xpath("//*[@id ='resultTable']/thead/tr/th"));
		System.out.println("Number of column in table: "+column.size());
		for(int i=1;i<=row.size();i++) {
			String s = driver.findElement(By.xpath("//*[@id ='resultTable']/tbody/tr["+i+"]/td[2]")).getText();
			if(s.equalsIgnoreCase("Joe.Root")) { //username
			for(int j=2;j<=column.size();j++) {
		   System.out.print(driver.findElement(By.xpath("//*[@id ='resultTable']/tbody/tr["+i+"]/td["+j+"]")).getText());
		System.out.print(" ");
			}
		}
		}
	}
}
