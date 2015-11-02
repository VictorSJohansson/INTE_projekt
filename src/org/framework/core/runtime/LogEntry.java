package org.framework.core.runtime;

import java.util.ArrayList;

public class LogEntry {
	
	/*
	 * This class is used to store information about tests
	 */
	
	private String testName;
	private ArrayList<Subtask> tasks;
	private int fails;
	
	
	//Constructor
	public LogEntry(String testName){
		this.testName = testName;
		this.tasks = new ArrayList<Subtask>();
	}

	//Returns name of test
	public String getTestName(){
		return testName;
	}
	
	public void addTask(Subtask task){
		tasks.add(task);
		if (task instanceof FailTask){
			fails+=1;
		}
	}
	
	public int getFails(){
		return fails;
	}
	
	public ArrayList<Subtask> getSubtask(){
		return tasks;
	}
}
