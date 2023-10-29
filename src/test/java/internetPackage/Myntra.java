package internetPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntraTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromdriver\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--remote-allow-origins=*");
	  WebDriver driver= new ChromeDriver(option);
	  Thread.sleep(2000);
	  driver.get("https://www.myntra.com");
	  Reporter.log("Myntra open", true);
	  Thread.sleep(3000);
	  driver.quit();
  }
}
