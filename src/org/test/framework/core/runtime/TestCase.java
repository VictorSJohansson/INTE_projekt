
package org.test.framework.core.runtime;

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

	public TestCase(String methodName)
	{
		this.methodName = methodName;
		this.instance = this.getClass();
	}

	public TestCase(String methodName, Object instance)
	{
		this.methodName = methodName;
		this.instance = instance;
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

			initializeSetup();

			instance.getClass().getMethod(methodName).invoke(instance);

			initializeTeardown();
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

		return result;
	}

	private void initializeTeardown()
	{
		if (instance instanceof Test)
			((Test) instance).teardown();
		else
			this.teardown();
	}

	private void initializeSetup()
	{
		if (instance instanceof Test)
			((Test) instance).setup();
		else
			this.setup();
	}
}
