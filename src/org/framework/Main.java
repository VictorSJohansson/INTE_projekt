package org.framework;

import java.util.ArrayList;
import java.util.List;

import org.framework.core.runtime.Runtime;

public class Main
{
	List<String> parameters;
	public Runtime runtime;
	private static boolean wasRun;
	
	private static int parametersRan;
	
	public Main()
	{
		parameters = new ArrayList<>(); 
		runtime = new Runtime();
		parametersRan = 0;
		wasRun = false;
	}
	
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
	
	public int getParametersRan()
	{
		return parametersRan;
	}
	
	public void run()
	{
		parametersRan = parameters.size();
		parameters.clear();
	}
	
	public static void main(String[]args)
	{
		parametersRan = args.length;
		wasRun = true;
	}
	
	public boolean wasRun()
	{
		return wasRun;
	}
	
}