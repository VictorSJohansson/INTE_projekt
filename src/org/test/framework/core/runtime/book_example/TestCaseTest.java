
package org.test.framework.core.runtime.book_example;

public class TestCaseTest extends TestCase {

	WasRun test;
	TestResult result;
	TestSuite suite;

	public TestCaseTest(String name)
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void setUp()
	{
		this.result = new TestResult();
	}

	// public void testRunning()
	// {
	// this.test.run();
	// assert this.test.wasRun;
	// }

	public void testTemplateMethod()
	{
		this.test = new WasRun("testMethod");
		this.test.run(result);
		assert("setUp testMethod tearDown ".equals(this.test.log));
	}

	public void testResult()
	{
		this.test = new WasRun("testMethod");
		result = test.run(result);
		assert"1 run, 0 failed".equals(result.summary());
	}

	public void testFailedResult()
	{
		this.test = new WasRun("testBrokenMethod");
		result = test.run(result);
		assert("1 run, 1 failed".equals(result.summary()));
	}

	public void testFailedResultFormatting()
	{
		result = new TestResult();
		result.testFailed();
		assert("1 run, 1 failed".equals(result.summary()));
	}

	public void testSuite()
	{
		suite = new TestSuite();
		suite.add(new WasRun("TestMethod"));
		suite.add(new WasRun("testBrokenMethod"));

		suite.run(result);

		assert("2 run, 1 failed".equals(result.summary()));
	}

	public void assertion(int i, int y)
	{
		assert i == y;
	}

	public static void main(String[] args)
	{
		TestSuite suite = new TestSuite();

		suite.add(new TestCaseTest("testTemplateMethod"));
		suite.add(new TestCaseTest("testResult"));
		suite.add(new TestCaseTest("testFailedResultFormatting"));
		suite.add(new TestCaseTest("testFailedResult"));
		suite.add(new TestCaseTest("testSuite"));
		// suite.add(new TestCaseTest("assertion"));

		TestResult result = new TestResult();
		suite.run(result);

		System.out.println(result.summary());
	}
}
