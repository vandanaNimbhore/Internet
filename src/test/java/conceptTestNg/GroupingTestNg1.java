package conceptTestNg;

import org.testng.annotations.Test;

public class GroupingTestNg1 {
	@Test(groups= {"sanity"})
	  public void p() {
		  
		 System.out.println("sanity p method"); 
	  }
	  @Test(groups= {"smoke"})
	  public void q()
	  {
		  System.out.println("smoke q method");
	  }
	  @Test(groups= {"smoke","regression"})
	  public void r()
	  {
		  System.out.println("smoke regression  r method");
	  }
	  @Test(groups= {"sanity","regression"})
	  public void s()
	  {
		  System.out.println("sanity regression s method");
	  }
	  @Test
	  public void t()
	  {
		  System.out.println(" t method");
	  }
	  
	  
}
