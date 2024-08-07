package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	    public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button")).click();
		driver.findElement(By.xpath("//input[@name=\"FullName\"]")).sendKeys("Vivek Shirude");
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("vivekshirude1994@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"CompanyName\"]")).sendKeys("Infosys");
		
		// Dropdown Handling
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@name=\"Country\"]"));
		Select dd = new Select(Dropdown);
		dd.selectByVisibleText("Armenia");
		driver.findElement(By.xpath("//input[@name=\"Contact\"]")).sendKeys("9765445435");
		String Title = driver.getTitle();
		System.out.println("Page Title :" + Title);
		String URL = driver.getCurrentUrl();
		System.out.println("URL: "+ driver.getCurrentUrl());
		//String PageSource = driver.getPageSource();
		//System.out.println("PageSource:" + driver.getPageSource());
		//driver.switchTo().newWindow(WindowType.WINDOW); // open new window
		//driver.switchTo().newWindow(WindowType.TAB);	// open new tab
		//driver.navigate().forward();
		//driver.navigate().back();
		
		
	}

}
