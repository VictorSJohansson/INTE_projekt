
package org.test.framework.core.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Creates a simple testcase. One testcase is bound to one test and result. After a
 * testcase is created you run the case, either as an child if you use
 * inheritance or by adding the class instance to the testcase.
 */

public class TestCase implements Test {

	String methodName;
	Method method;
	// Class<?> cl;
	Object instance;

	public TestCase(String methodName)
	{
		this.methodName = methodName;
		this.instance = this.getClass();
	}

	// public TestCase(String methodName, Class<?> cl)
	// {
	// this.methodName = methodName;
	// this.cl = cl;
	// }

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

	// public TestResult run(TestResult result)
	// {
	// if (methodName.isEmpty())
	// throw new NullPointerException();
	//
	// try
	// {
	// result.testStarted();
	// this.setup();
	// method = cl.getMethod(methodName);
	// method.invoke(cl.newInstance());
	// this.teardown();
	// }
	// catch (IllegalAccessException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// e.printStackTrace();
	// }
	// catch (IllegalArgumentException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// e.printStackTrace();
	// }
	// catch (InvocationTargetException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// // System.out.println("InvocationTargetException");
	// // e.printStackTrace();
	// }
	// catch (NoSuchMethodException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// System.out.println("NoSuchMethodException");
	// // e.printStackTrace();
	// }
	// catch (SecurityException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// e.printStackTrace();
	// }
	// catch (InstantiationException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// System.out.println("InstantiationException");
	// // e.printStackTrace();
	// }
	//
	// return result;
	// }

	public TestResult run(TestResult result)
	{
		if (methodName.isEmpty())
			throw new NullPointerException("MethodName is empty");

		try
		{
			result.testStarted();

			initializeSetup();

			// if()
			// {
			// System.out.println(cl.getName());
			// cl.getMethod("setup").invoke(cl);
			// }

			instance.getClass().getMethod(methodName).invoke(instance);

			// method = cl.getMethod(methodName);
			// method.invoke(cl.newInstance());

			initializeTeardown();
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
			// System.out.println("InvocationTargetException");
			// e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
			System.out.println("NoSuchMethodException");
			// e.printStackTrace();
		}
		catch (SecurityException e)
		{
			// TODO Auto-generated catch block
			result.testFailed();
			e.printStackTrace();
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

	/**
	 * Run a simple testcase, which takes the class parameter and run the method
	 * and update result with how it went.
	 */

	// public TestResult run(TestResult result, Class<?> cl)
	// {
	// if (methodName.isEmpty())
	// throw new NullPointerException();
	//
	// try
	// {
	// result.testStarted();
	// this.setup();
	// method = cl.getMethod(methodName);
	// method.invoke(cl.newInstance());
	// this.tearDown();
	// }
	// catch (IllegalAccessException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// System.out.println("IllegalAccessException");
	// // e.printStackTrace();
	// }
	// catch (IllegalArgumentException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// System.out.println("IllegalArgumentException");
	// // e.printStackTrace();
	// }
	// catch (InvocationTargetException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// // System.out.println("InvocationTargetException");
	// // e.printStackTrace();
	// }
	// catch (NoSuchMethodException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// System.out.println("NoSuchMethodException");
	// // e.printStackTrace();
	// }
	// catch (SecurityException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// System.out.println("SecurityException");
	// // e.printStackTrace();
	// }
	// catch (InstantiationException e)
	// {
	// // TODO Auto-generated catch block
	// result.testFailed();
	// System.out.println("InstantiationException");
	// // e.printStackTrace();
	// }
	//
	// return result;
	// }
}
