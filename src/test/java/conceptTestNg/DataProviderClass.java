package conceptTestNg;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="FbData")
	public String[][] userNamePassword()
	{
		String data[][]= {{"abc","abc123"},{"pqr","pqr123"},{"stuv","stuv123"}};
		return data;
	}
	
}
