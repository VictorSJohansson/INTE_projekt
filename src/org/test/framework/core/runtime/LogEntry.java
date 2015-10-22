package org.test.framework.core.runtime;

import java.lang.reflect.Field;

public class LogEntry {
	
	/*
	 * This class is used to store information about failed tests
	 */
	
	private String testName;
	private Object value1;
	private Object value2;
	
	//Constructor when comparing two values
	public LogEntry(String testName, Object value1, Object value2){
		this.testName = testName;
		this.value1 = value1;
		this.value2 = value2;
	}
	
	//Constructor when comparing one value
	public LogEntry(String testName, Object value){
		this.testName = testName;
		this.value1 = value;
	}
	
	//Returns name of test
	public String getTestName(){
		return testName;
	}
	
	//Returns the first value submitted
	public Object getValue1(){
		return value1;
	}
	
	//Returns the second value
	public Object getValue2(){
		return value2;
	}
	
	/*
	 * The following method returns a string with the value of the expected object, weather it be
	 * of any primitve datatypes.
	 */
	public String getValue(Object entryObject){
		try{
			for (Field field : entryObject.getClass().getDeclaredFields()){
		
				field.setAccessible(true);
				Object value = field.get(entryObject);
				if (value != null){
					return value.toString();
				}
			}
			}catch(final IllegalAccessException e){
				e.printStackTrace();
			}
		return "failed to find a value";
	}

}
