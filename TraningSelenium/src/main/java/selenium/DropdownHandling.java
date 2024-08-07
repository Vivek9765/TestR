package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
		//List <WebElement> birthMonth = driver.findElements(By.xpath(""));
		
		
		WebElement dd = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]")); // dropdown 
	    Select dropdown = new Select(dd);
	    dropdown.selectByValue("15");
	    
	    
	     WebElement dd1 = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
	     Select dropdown1 = new Select (dd1);
	     dropdown1.selectByVisibleText("Aug");
	     
	     WebElement dd2 = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
	     Select dropdown2 = new Select (dd2);
	     dropdown2.selectByIndex(3);
	     
	     
	}

}
