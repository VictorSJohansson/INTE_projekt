package org.framework;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	
	List<String> parameters = new ArrayList<>(); 
	
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
	
	public void addParameter(String... cl)
	{
		parameters.add("");
		parameters.add("");
		parameters.add("");
		parameters.add("");
		parameters.add("");
	}
	
	
}