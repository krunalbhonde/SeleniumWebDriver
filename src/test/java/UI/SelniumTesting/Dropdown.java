package UI.SelniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// Drop down by using Selected class (vvimp)
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize(); // for maximize window
		
		// drop down by using Selected class
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='continents']"));
		Select s = new Select(dropdown);   
		s.selectByVisibleText("South America");
		System.out.println(s.getFirstSelectedOption().getText()); // checking is it writing the text
		System.out.println(s.isMultiple());  // checking is it multiple or not
		
		// multiple drop down selection by using select class
		
		WebElement mdropdown = driver.findElement(By.cssSelector("#selenium_commands"));
		Select s1 = new Select(mdropdown);
		System.out.println(s1.isMultiple());
		s1.selectByVisibleText("Navigation Commands");
		s1.selectByVisibleText("Browser Commands");
		s1.selectByVisibleText("Wait Commands");
	}

}
