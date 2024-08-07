package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://fitpeo.com/revenue-calculator");
	   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
	   WebElement slider = driver.findElement(By.xpath("//input[@type=\"number\"]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].value = 820;", slider);
	   ((JavascriptExecutor) driver).executeScript("arguments[0].dispatchEvent(new Event('change'));", slider);
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@id=\":R57alklff9da:\"]"));
	   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
	   WebElement slider1 = driver.findElement(By.xpath("//input[@type=\"number\"]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].value = 560;", slider);
	   ((JavascriptExecutor) driver).executeScript("arguments[0].dispatchEvent(new Event('change'));", slider);
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[1]/input")).click();
	   

	   
	}

}
