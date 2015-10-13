
package org.test.framework.core.runtime.book_example;

import java.lang.reflect.InvocationTargetException;

public class TestCase {

	private java.lang.reflect.Method method;
	private String methodName;

	public TestCase(String methodName)
	{
		this.methodName = methodName;
	}
	
	public void setUp()
	{

	}
	
	public void tearDown()
	{
		
	}
	
	public TestResult run()
	{
		return run(new TestResult());
	}

	public TestResult run(TestResult result)
	{

			try
			{
				
				result.testStarted();
				this.setUp();	
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
	
}