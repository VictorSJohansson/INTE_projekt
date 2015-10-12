
package org.test.framework.core.runtime.book_example;

import java.lang.reflect.InvocationTargetException;

public class TestCase {

	java.lang.reflect.Method method;
	String name;

	public TestCase(String name)
	{
		this.name = name;
	}
	
	public void setUp()
	{

	}
	
	public void tearDown()
	{
		
	}

	public TestResult run(TestResult result)
	{
		try
		{
			result.testStarted();
			this.setUp();	
			method = this.getClass().getMethod(name);
			method.invoke(this);
			this.tearDown();
		}
		catch (NoSuchMethodException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
		}
		catch (SecurityException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
		}
		catch (IllegalArgumentException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
		}
		catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
		}
		catch(Exception e)
		{
			result.testFailed();
		}
		
		return result;
	}
	
}
