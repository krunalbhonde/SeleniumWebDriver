package UI.SelniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_withoutSelectClass {

	public static void main(String[] args) {
		// Drop down without using Select class 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//list of web element : when we use list webElement then use ||findElements|| not WebElement
  		List<WebElement> ls =driver.findElements(By.xpath("//select[@id='continents']/option"));
	      for(WebElement w:ls) {
	    	  if(w.getText().contains("Africa"));{
	    		  w.click();
	    	  }
	      }
		/*WebElement dropdown = driver.findElement(By.xpath("//select[@id='continents']"));
		dropdown.findElement(By.xpath("//option[. ='Africa']"));*/

	}

}
