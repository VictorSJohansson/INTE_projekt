package org.framework.core.runtime;

import java.lang.reflect.Field;

public class FailEntry extends LogEntry{
	
	private Object value1;
	private Object value2;
	
	public FailEntry(String testName, Object value1, Object value2){
		super(testName);
		this.value1=value1;
		this.value2=value2;
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
