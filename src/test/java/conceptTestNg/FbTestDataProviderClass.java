package conceptTestNg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbTestDataProviderClass {
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","D:\\chromdriver\\chromedriver-win64\\chromedriver.exe");
		// ChromeOptions option=new ChromeOptions();
		 // option.addArguments("--remote-allow-origins=*");
		    driver=new FirefoxDriver();
		  
		driver.get("https://www.facebook.com/login");
		Thread.sleep(3000);
		
	}
  @Test(dataProvider="FbData",dataProviderClass=conceptTestNg.DataProviderClass.class)
  public void testData(String un,String pw) throws IOException, InterruptedException {
	  
		WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
		
	       userName.sendKeys(un);
	       Thread.sleep(3000);
	       WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	       password.sendKeys(pw);
	       Thread.sleep(3000);
	       WebElement login=driver.findElement(By.xpath("//button[text()='Log in']"));
	       login.click();
	       }
  @AfterTest
  public void aftertest()
  {
	  
  }
}