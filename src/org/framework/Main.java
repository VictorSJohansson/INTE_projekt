
package org.framework;

import java.util.ArrayList;
import java.util.List;

import org.framework.core.runtime.LogEntry;
import org.framework.core.runtime.Runtime;
import org.framework.core.runtime.TestLogger;
import org.framework.tests.target.TestClassForMain;

public class Main {

	List<String> parameters;
	public Runtime runtime;

	private boolean wasRun = false;
	private int parametersRan = 0;

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
		if (parameter == null)
			throw new NullPointerException();

		parameters.add(parameter);
		wasRun = false;
	}

	public void addParameter(String... string)
	{
		for (String token : string)
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

		for (String className : parameters)
		{
			try
			{
				runtime.addClass(Class.forName(className));
			}
			catch (ClassNotFoundException e)
			{
				TestLogger.appendEntry(new LogEntry(
						className + " is not a viable class\n"));
			}
		}
		
		runtime.execute();
		
		TestLogger.summary();
		
		parameters.clear();
		
		wasRun = true;
	}

	public void run(String[] args)
	{
		for (String token : args)
			parameters.add(token);

		run();
	}

	public static void main(String[] args)
	{	
		new Main().run(args);
	}

	public boolean wasRun()
	{
		return wasRun;
	}

}