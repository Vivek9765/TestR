package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		// specify the properties file location 
		File src = new File("C:\\Users\\INDIA\\eclipse-workspace\\TraningSelenium\\Object_Repo.properties");
		
		// create FileInputStream class object to load file
		FileInputStream fis = new FileInputStream(src);
		
		// create properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));	
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		
	}

}
