package org.test.framework.core.runtime;

public abstract class LogEntry {
	
	/*
	 * This class is used to store information about failed tests
	 */
	
	private String testName;
	
	
	//Constructor
	public LogEntry(String testName){
		this.testName = testName;
		
		//Skicka in nullvärde istället
	}

	//Returns name of test
	public String getTestName(){
		return testName;
	}
}
