package UI.SelniumTesting;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartClass {

	public static void main(String[] args) throws InterruptedException {
		// Alert Class
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		// for alert pop up :Click Button to see alert
		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		// Thread.sleep(2000); // its java timer don't use on program
		driver.switchTo().alert().accept();

		// For Alert : On button click, alert will appear after 5 seconds
		driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		// implicitly wait : wait syntax
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().alert().accept();

		// For Alert : On button click, confirm box will appear
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		// accept() : OK will select
		// dismiss(): cancel will select
	}
}
