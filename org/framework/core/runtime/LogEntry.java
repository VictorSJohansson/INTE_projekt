package org.framework.core.runtime;

public class LogEntry {
	
	/*
	 * This class is used to store information about failed tests
	 */
	
	private String testName;
	private ArrayList<Subtask> tasks = new ArrayList<Subtask>();
	
	
	//Constructor
	public LogEntry(String testName){
		this.testName = testName;
		
		
		//Skicka in nullvärde istället
	}

	//Returns name of test
	public String getTestName(){
		return testName;
	}
	
	public ArrayList getSubTask(){
		return tasks;
	}
}
