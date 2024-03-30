package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;

public class customListener  implements ITestListener  {

	
	//updated customListener
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case: "+result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		//capturing screenshot
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		//capturing screenshot
		
//		/test
		System.out.println(result.getThrowable());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

	
}
