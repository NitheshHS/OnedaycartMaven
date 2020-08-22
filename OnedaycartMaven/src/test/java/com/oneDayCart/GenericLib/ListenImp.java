package com.oneDayCart.GenericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
/**
 * This class implements ITestListener and it will provide various method during exceution
 * @author Nithesh H S
 *
 */
public class ListenImp implements ITestListener{
	/*
	 * This method will take screenshot whenever testscripts fails
	 * (non-Javadoc)
	 * @see org.testng.ITestListener#onTestFailure(org.testng.ITestResult)
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		Utility.takeScreenshot(Base.staticDriver, result);
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
