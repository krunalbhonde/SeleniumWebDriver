package UI.SelniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// Drag and Drop
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println("Frame Count:"+ driver.findElements(By.tagName("iframe")).size()); // list
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		a.dragAndDrop(drag, drop).perform();   // dragAndDrop syntax
	}
}
