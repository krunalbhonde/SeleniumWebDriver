package UI.SelniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// Action class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);   // Actions class not action
		WebElement s= driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		a.moveToElement(s).perform(); // without perform action class is not performing 
		WebElement  signup =driver.findElement(By.cssSelector("#nav-link-accountList"));
		a.moveToElement(signup).perform();
		
		// search in textbox
		WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).sendKeys("runal").perform();
      
		//keyDown(Keys.SHIFT) =for Capital letter
		//keyUp(Keys.SHIFT) = for small letter
		
		// for right click of mouse
		a.contextClick().perform();
		
		// for scrolling the page
		
		
		a.scrollByAmount(0, 1000).perform();
	}

}
