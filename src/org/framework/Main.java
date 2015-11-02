package org.framework;

public class Main
{
	
	String[] parameters = new String[0]; 
	
	public String[] getParameters()
	{
		return parameters;
	}
	
	public void addParameter(String parameter)
	{
		parameters = new String[1];
		parameters[0] = parameter;
	}
	
	
}