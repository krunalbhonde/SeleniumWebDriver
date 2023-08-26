package UI.SelniumTesting;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) {
		/* Window Handle : Click on URL --> It will in new Tab --> Verify the tab title */
		WebDriver driver = new ChromeDriver();
		driver.get("https://ultimateqa.com/dummy-automation-websites");
		//driver.findElement(By.xpath("(//*[text()='SauceDemo.com'])[1]")).click();
		driver.findElement(By.linkText("SauceDemo.com")).click();
		String mainpage = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();  // 
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String child = it.next();
			if(!mainpage.equalsIgnoreCase(child)) {
				String url =driver.switchTo().window(child).getCurrentUrl();
				System.out.println("Current URL: " +url);
			/*	driver.close();  // For Close the Tab   driver.quit();  // for close the  Browser */			
			}
		}
		String mainurl =driver.switchTo().window(mainpage).getCurrentUrl();
		System.out.println("Main Page URL: " + mainurl);
	}
}
