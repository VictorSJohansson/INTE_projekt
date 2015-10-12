
package org.test.framework.core.runtime.book_example;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {

	List<TestCase> tests;
	
	public TestSuite()
	{
		tests = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public void add(TestCase test)
	{
		tests.add(test);
	}
	
	public void run(TestResult result)
	{
		for(TestCase test : tests)
		{
			test.run(result);
		}
	}
}
