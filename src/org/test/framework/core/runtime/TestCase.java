
package org.test.framework.core.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

	private String methodName;
	private Method method;

	public TestCase(String methodName)
	{
		this.methodName = methodName;
	}

	public void setup()
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
}
