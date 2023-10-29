package conceptTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingClass {
	
  @Test(groups= {"sanity"})
  public void a() {
	  
	 System.out.println("sanity a method"); 
  }
  @Test(groups= {"smoke"})
  public void b()
  {
	  System.out.println("smoke b method");
  }
  @Test(groups= {"smoke","regression"})
  public void c()
  {
	  System.out.println("smoke regression  c method");
  }
  @Test(groups= {"sanity","regression"})
  public void d()
  {
	  System.out.println("sanity regression d method");
  }
  @Test
  public void e()
  {
	  System.out.println(" e method");
  }
  
  
  
}
