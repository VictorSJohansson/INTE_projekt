
package org.test.framework.core.runtime;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runtime {

	public static final Class<OurTest> ANNOTATION = OurTest.class;

	public List<Class<?>> classList;

	/**
	 * Empty constructor which creates a new empty classList for the runtime
	 * class
	 */

	public Runtime()
	{
		// classList = new ArrayList<>();
		// classList.add(TestClass.class);
		// this(TestClass.class);
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
		classList = cl;
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
		classList.addAll(cl);
	}

	/**
	 * Add a array of classes to the classList
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

		Method[] m = cl.getMethods();

		for (Method met : m)
		{
			if (met.isAnnotationPresent(annotation))
				listOfMethodNames.add(met.getName());
		}

		return listOfMethodNames;
	}

	/**
	 * Execute all the added classes in classList with the proper annotation,
	 * returns a TestResult over the progress of all the testcases
	 */

	public TestResult execute()
	{
		TestResult result = new TestResult();

		for (Class<?> cl : classList)
		{
			TestSuite suite = new TestSuite();
			List<String> names = getMethodNames(ANNOTATION, cl);

			for (String methodName : names)
			{
				suite.add(new TestCase(methodName));
				// TestCase t = new TestCase(s);
				// t.run(result, TestClass.class);
			}

			suite.run(result, cl);
		}

		return result;
	}
}
