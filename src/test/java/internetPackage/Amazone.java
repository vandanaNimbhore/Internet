package internetPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Amazone {
	WebDriver driver;
  @Parameters({"browserName"})
  @Test
  public void amazoneData(String browserName) throws InterruptedException {
	  if(browserName.equals("edge"))
	  { 
		   driver= new EdgeDriver();
	  }
	  else
		  if(browserName.equals("chrome"))
	  {	
			   driver= new ChromeDriver();
	  }
	  driver.get("https://www.amazon.in");
	  Reporter.log("Amazzone open", true);
	  Thread.sleep(3000);
	  driver.quit();
	  
  }
}
   