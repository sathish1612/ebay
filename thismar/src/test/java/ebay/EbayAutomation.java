package ebay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EbayAutomation {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("(//a[text()='Electronics'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Cell Phones & Accessories']")).click();
		driver.findElement(By.xpath("//a[text()='Cell Phones & Smartphones']")).click();
		driver.findElement(By.xpath("(//span[text()='See All'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Screen Size']")).click();
		driver.findElement(By.xpath("//span[text()='4.0 - 4.4 in']/../..//input[@class='checkbox__control']")).click();
		driver.findElement(By.xpath("(//span[text()='Price'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show items priced from']/../..//input)[1]")).sendKeys("10");
		driver.findElement(By.xpath("(//span[text()='Show items priced from']/../..//input)[2]")).sendKeys("50");
		driver.findElement(By.xpath("//span[text()='Item Location']")).click();
		driver.findElement(By.xpath("//span[text()='Worldwide']/../..//input")).click();
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		//driver.findElement(By.xpath("//span[text()='3 filters applied']")).click();
		
		
	}
}
