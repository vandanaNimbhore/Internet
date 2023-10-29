package internetPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipdata() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromdriver\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--remote-allow-origins=*");
	  WebDriver driver= new ChromeDriver(option);
	  Thread.sleep(2000);
	  driver.get("https://www.flipkart.com");
	  Reporter.log("Flipkart open", true);
	  Thread.sleep(3000);
	  driver.quit();
  }
}
