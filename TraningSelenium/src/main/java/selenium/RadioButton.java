package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
		
		List <WebElement> radio=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("Total Radio Button" + radio.size()); // display total radio buttons
		System.out.println(radio.get(0).isEnabled()); 
		System.out.println(radio.get(1).isDisplayed());
		System.out.println(radio.get(2).isSelected());
		
		
	}

}
