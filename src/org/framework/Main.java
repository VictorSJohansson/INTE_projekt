package org.framework;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	
	List<String> parameters = new ArrayList<>(); 
	
	public List<String> getParameters()
	{
		return parameters;
	}
	
	public void addParameter(String parameter)
	{
		parameters.add(parameter);
	}
	
	
}