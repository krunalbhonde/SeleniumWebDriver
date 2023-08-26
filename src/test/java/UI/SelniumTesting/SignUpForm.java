package UI.SelniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpForm {

	public static void main(String[] args) throws InterruptedException {
		// Sign up Form fill up method
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Krunal");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bhonde");
		driver.findElement(By.xpath("//*[@id='sex-0']")).click();
		System.out.println("male " + driver.findElement(By.xpath("//*[@id='sex-0']")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='exp-2']")).click();
		System.out.println("3" + driver.findElement(By.xpath("//*[@id='exp-2']")).isSelected());
		driver.findElement(By.id("profession-1")).click(); //* is tagname all including
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		
		
		

	}

}
