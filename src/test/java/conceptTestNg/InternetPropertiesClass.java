package conceptTestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InternetPropertiesClass {
	public static String readDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream myFile= new FileInputStream("C:\\Users\\91935\\eclipse-workspace\\Internet\\internetfile.properties"); 
	     Properties prop=new Properties();
	     prop.load(myFile);
	     String value=prop.getProperty(key);
	     System.out.println(value);
	    return value;
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromdriver\\chromedriver-win64\\chromedriver.exe");
		 ChromeOptions option=new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
		  WebDriver  driver=new ChromeDriver(option);
		driver.get(InternetPropertiesClass.readDataFromPropertiesFile("url"));
		driver.manage().window().maximize();
		
		   WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
	       userName.sendKeys(InternetPropertiesClass.readDataFromPropertiesFile("userName"));
	       
	       WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	       password.sendKeys(InternetPropertiesClass.readDataFromPropertiesFile("password"));
	       
	       WebElement login=driver.findElement(By.xpath("//button[text()='Log in']"));
	       login.click();
		
		//InternetPropertiesClass.readDataFromPropertiesFile("userName");
		//InternetPropertiesClass.readDataFromPropertiesFile("password");

		
		
	}

}
