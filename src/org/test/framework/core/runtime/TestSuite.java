
package org.test.framework.core.runtime;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * TestSuite class store testcases and then run them by invoking the run method.
 * 
 * @author Sebastian de Rzewuski
 * @Contact Sebastian.de.Rzewuski@gmail.com
 * @Version 1.0
 */

public class TestSuite {

	List<TestCase> listOfTestCases;

	public TestSuite()
	{
		listOfTestCases = new ArrayList<>();
	}

	public void add(TestCase test)
	{
		listOfTestCases.add(test);
	}

	public void run(TestResult result)
	{
		for (TestCase test : listOfTestCases)
		{
			test.run(result);
		}
	}
}