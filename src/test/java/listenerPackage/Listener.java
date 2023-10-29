package listenerPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public  class Listener implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		String tcName=result.getName();
		Reporter.log("test case " +tcName+ " started",false);
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String tcName=result.getName();
		Reporter.log("test case is " +tcName+ " success", true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String tcName=result.getName();
		Reporter.log("test case is " +tcName+" skipped",true);
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String tcName=result.getName();
		Reporter.log("testcase is "  +tcName+" fail",true);
	}
}
