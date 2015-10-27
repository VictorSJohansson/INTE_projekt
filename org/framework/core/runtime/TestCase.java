package org.framework.core.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Creates a simple testcase. One testcase is bound to one test and result.
 * After a testcase is created you run the case, either as an child if you use
 * inheritance or by adding the class instance to the testcase.
 */

public class TestCase implements Test {

	String methodName;
	Object instance;
	LogEntry entry;

	public TestCase(String methodName)
	{
		try
		{
			this.methodName = methodName;
			this.instance = this.getClass().newInstance();
			entry = new LogEntry(methodName);
			TestLogger.append(entry);
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			System.out.println("InstantationException - TestCase");
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			System.out.println("IllegalAccessException - TestCase");
		}
	}

	public TestCase(String methodName, Object instance)
	{
		this.methodName = methodName;
		this.instance = instance;
		entry = new LogEntry(methodName);
		TestLogger.append(entry);
	}

	/**
	 * Setup is used in inheritance and can be customized for the running
	 * testcase
	 */

	@Override
	public void setup()
	{

	}

	/**
	 * Teardown is used in inheritance and can be customized for the running
	 * testcase
	 */

	@Override
	public void teardown()
	{

	}

	/**
	 * Run can be used in inheritance, then you dont will use this as class
	 * reference instead of sending the class
	 */

	public TestResult run()
	{
		return run(new TestResult());
	}

	/**
	 * Run a simple testcase and update result with how it went.
	 */

	public TestResult run(TestResult result)
	{
		if (methodName == null)
			throw new NullPointerException("MethodName is null");
		if (instance == null)
			throw new NullPointerException("Instance is null");

		try
		{	
			result.testStarted();

			runSetup();
			
			instance.getClass().getMethod(methodName).invoke(instance);
		}
		catch (IllegalAccessException e)
		{
			result.testFailed();
		}
		catch (IllegalArgumentException e)
		{
			result.testFailed();
		}
		catch (InvocationTargetException e)
		{
			result.testFailed();
		}
		catch (NoSuchMethodException e)
		{
			result.testFailed();
		}
		catch (SecurityException e)
		{
			result.testFailed();
		}
		finally
		{
			runTeardown();
		}

		return result;
	}

	private void runTeardown()
	{
		if (instance instanceof Test)
			((Test) instance).teardown();
		else
			this.teardown();
	}

	private void runSetup()
	{
		if (instance instanceof Test)
			((Test) instance).setup();
		else
			this.setup();
	}
	
	public String getMethodName()
	{
		return this.methodName;
	}
}
