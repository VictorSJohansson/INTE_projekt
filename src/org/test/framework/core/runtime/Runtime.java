
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
	 * Empty constructor with a hardcoded testClass, which we will have to
	 * remove later.
	 */

	public Runtime()
	{
		// classList = new ArrayList<>();
		// classList.add(TestClass.class);
		this(TestClass.class);
	}

	/**
	 * Constructor which takes classes as an parameter, These can later on be
	 * executed.
	 */

	public Runtime(Class<?>... cl)
	{
		classList = Arrays.asList(cl);
	}

	/**
	 * Receive all method names in a list from input class which contains the
	 * asked annotation.
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
	 * Execute all the added classes in classList with the proper annotation
	 * 
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
