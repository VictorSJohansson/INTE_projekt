package org.framework;

import java.util.ArrayList;
import java.util.List;

import org.framework.core.runtime.Runtime;

public class Main
{
	List<String> parameters = new ArrayList<>(); 
	public Runtime runtime = new Runtime();
	
	public List<String> getParameters()
	{
		return new ArrayList<String>(parameters);
	}
	
	public void addParameter(String parameter)
	{
		if(parameter == null)
			throw new NullPointerException();
		
		parameters.add(parameter);
	}
	
	public void addParameter(String... string)
	{
		for(String token : string)
		{
			addParameter(token);
		}
	}
	
	
	
	
}