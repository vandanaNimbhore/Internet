package listenerPackage;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPackage.Listener.class)

public class ListenerTestClass {
	@Test
	public void methodA()
	{
		Reporter.log("this is A method", true);
	}
	@Test
	public void methodB()
	{
		Reporter.log("this is B method",true);
	}
	@Test
	public void methodC()
	{
		Reporter.log("this is C method", true);
	}
	
}
