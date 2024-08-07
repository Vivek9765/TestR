package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
		@Test
		public static void TestGoogle() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			//driver.manage().window().fullscreen();
			driver.findElement(By.name("q")).sendKeys("Iphone",Keys.ENTER);
			System.out.println(driver.getTitle());
			driver.quit();
			}
		@Test
		public static void Facebook () {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("vivekshirude1994@gmail.com");
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Vivek@9765");
			
		}
}
