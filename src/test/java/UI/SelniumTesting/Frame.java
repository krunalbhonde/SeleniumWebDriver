package UI.SelniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// Frame : 
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			 //elements used for size count
			System.out.println(driver.findElements(By.tagName("iframe")).size());
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='frame1']")));
			System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		
	}

}
