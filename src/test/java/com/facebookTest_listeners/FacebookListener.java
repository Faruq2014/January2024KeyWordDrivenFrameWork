package com.facebookTest_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FacebookListener implements ITestListener{
	//interface is like class but they do not have 
		  // only have declaration
		 // do not have implementation
		 // hiding concept
		 //implements is the key word for inheritance for interface

	
	
	@Override
	public void onTestStart(ITestResult result) {
		// Test level
		System.out.println(result.getMethod().getMethodName()+" Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// Test level
		if(result.getStatus()==1) {
			System.out.println(result.getMethod().getMethodName()+"  PASS AND COMPLETED");
		}else if(result.getStatus()==3){
			System.out.println(result.getMethod().getMethodName()+"  SKIPPED");
		}
		else {
			System.out.println(result.getMethod().getMethodName()+" FAILED");
		}
	//System.out.println(result.getMethod().getMethodName()+" >>>>>  PASS);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//System.out.println(result.getMethod().getMethodName()+" Test Failed");
		
		if(result.getStatus()==1) {
			System.out.println(result.getMethod().getMethodName()+"  PASS");
		}else if(result.getStatus()==3){
			System.out.println(result.getMethod().getMethodName()+"  SKIPPED");
		}
		else {
			System.out.println(result.getMethod().getMethodName()+" FAILED");
		}
		
		System.out.println(result.getThrowable()+" reason for Failed");
		System.out.println(" Take a screen shoot."+result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		if(result.getStatus()==1) {
			System.out.println(result.getMethod().getMethodName()+"  PASS");
		}else if(result.getStatus()==3){
			System.out.println(result.getMethod().getMethodName()+"  SKIPPED");
		}
		else {
			System.out.println(result.getMethod().getMethodName()+" FAILED");
		}
		
		
		System.out.println(result.getThrowable()+" reason for skipped");
		
		System.out.println("TAKE A SCREEN SHOOT");
		//System.out.println(result.getMethod().getMethodName()+" Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" Test Failed");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" Test Failed");
	}

	@Override
	public void onStart(ITestContext context) {
		// This is Suite level
		System.out.println(context.getSuite().getName()+"  started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//  This is Suite level
		System.out.println(context.getSuite().getName()+"  Completed");
	}
	
	public void takeScreenShot() {
		
	}

}
