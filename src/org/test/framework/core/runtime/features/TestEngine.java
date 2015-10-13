
package org.test.framework.core.runtime.features;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.test.framework.core.runtime.OurTest;
import org.test.framework.core.runtime.TestResult;
import org.test.framework.core.runtime.TestSuite;

public abstract class TestEngine
		implements TestFrameworkRunnable, TestFrameworkExecutable {

	private String methodName;
	private java.lang.reflect.Method method;

	public TestEngine()
	{
		
	}
	
	public TestEngine(String methodName)
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

	@Override
	public TestResult execute(Class<?>... cl)
	{
		TestResult result = new TestResult();
		TestSuite suite = new TestSuite();

		for (Class<?> c : cl)
		{
			Method[] m = c.getMethods();

			for (Method met : m)
			{
				if (met.isAnnotationPresent(OurTest.class))
				{
//					suite.add(new Test(met.getName()));
				}
			}
		}

		suite.run(result);

		System.out.println(result.summary());
		
		return result;
	}
}
