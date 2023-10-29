package listenerPackage;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPackage.Listener.class)
public class ListenerTestClass1 
{
	@Test
	public void p ()
	{
		Reporter.log("P method",true);
	}
	@Test
	public void q()
	{
		Reporter.log("Q method",true);
	}
	

}
