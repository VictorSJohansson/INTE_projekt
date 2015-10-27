
package org.framework.core.runtime;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runtime {

	private List<Class<?>> classList;

	/**
	 * Empty constructor which creates a new empty classList for the runtime
	 * class
	 */

	public Runtime()
	{
		this(new ArrayList<Class<?>>());
	}

	/**
	 * Constructor which takes classes as an parameter.
	 */

	public Runtime(Class<?>... cl)
	{
		this(new ArrayList<Class<?>>(Arrays.asList(cl)));
	}

	/**
	 * Constructor which takes a list of classes as an parameter.
	 */

	public Runtime(List<Class<?>> cl)
	{
		classList = new ArrayList<Class<?>>(cl);
	}

	public int size()
	{
		return classList.size();
	}

	/**
	 * Clears the current classList. Can be useful when runtime has executed a
	 * fixed amount of classes and dont want to execute them again.
	 */

	public void emptyClasses()
	{
		classList.clear();
	}

	/**
	 * Add a list of classes to the classList
	 */

	public void addClass(List<Class<?>> cl)
	{
		classList.addAll(new ArrayList<Class<?>>(cl));
	}

	/**
	 * Add an array of classes to the classList
	 */

	public void addClass(Class<?>... cl)
	{
		classList.addAll(new ArrayList<Class<?>>(Arrays.asList(cl)));
	}

	/**
	 * Add a class to the classList
	 */

	public void addClass(Class<?> cl)
	{
		classList.add(cl);
	}

	/**
	 * Receive all method names in a list from the input class.
	 */

	public List<String> getMethodNames(Class<? extends Annotation> annotation,
			Class<?> cl)
	{
		List<String> listOfMethodNames = new ArrayList<>();

		Method[] methodsInClass = cl.getMethods();

		for (Method method : methodsInClass)
		{
			if (method.isAnnotationPresent(annotation))
				listOfMethodNames.add(method.getName());
		}

		return listOfMethodNames;
	}

	/**
	 * Execute all the added classes in classList with the proper annotation,
	 * returns a TestResult over the progress of all the testcases
	 */

	public TestResult execute()
	{
		return iterateClassList();
	}

	private TestResult iterateClassList()
	{
		TestResult result = new TestResult();

		for (Class<?> cl : classList)
		{
			TestSuite suite = new TestSuite();
			List<String> listOfMethodNames = getMethodNames(OurFramework.ANNOTATION, cl);

			iterateMethodNames(cl, suite, listOfMethodNames);

			suite.run(result);
		}

		return result;
	}

	private void iterateMethodNames(Class<?> cl, TestSuite suite,
			List<String> names)
	{
		for (String methodName : names)
		{
			try
			{
				suite.add(new TestCase(methodName, cl.newInstance()));
			}
			catch (InstantiationException e)
			{
				e.printStackTrace();
			}
			catch (IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public List<Class<?>> getClassList()
	{
		return new ArrayList<Class<?>>(classList);
	}
}
