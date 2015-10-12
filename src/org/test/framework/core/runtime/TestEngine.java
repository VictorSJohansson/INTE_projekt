package org.test.framework.core.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestEngine implements TestFramework{

	private String methodName;
	private java.lang.reflect.Method method;
	
	protected TestEngine(String methodName)
	{
		this.methodName = methodName;
	}

	@Override
	public void setup()
	{
		
	}

	@Override
	public void tearDown()
	{
		
	}
	
	@Override
	public void run()
	{
		run(new Result());
	}
	
	public Result run(Result result)
	{	
		try
		{	
			result.testStarted();
			this.setup();	
			method = this.getClass().getMethod(methodName);
			method.invoke(this);
			this.tearDown();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
			e.printStackTrace();
		}
		
		return result;
	}
	
	public void execute(Class<?>... cl)
	{	
		Result result = new Result();
		Runner run = new Runner();
		
		for(Class<?> c : cl)
		{
			Method []m = c.getMethods();
			
			for(Method met : m)
			{	
				if(met.isAnnotationPresent(OurTest.class))
				{
					run.add(new Test(met.getName()));
				}
			}
		}
		
		run.run(result);
		
		System.out.println(result.summary());
	}
}
