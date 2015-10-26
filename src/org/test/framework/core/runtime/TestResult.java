
package org.test.framework.core.runtime;

/**
 * 
 * TestResult is based of Kent Beck's book: Test-driven development by example.
 * It has been translated from the python language.
 * 
 * It will count how many of the testcases runned worked fine or failed. This
 * can be accessed by calling the summary method
 * 
 * @author Sebastian de Rzewuski
 * @Contact Sebastian.de.Rzewuski@gmail.com
 * @Version 1.0
 */

public class TestResult {

	int runCount;
	int errorCount;

	public TestResult()
	{
		this.runCount = 0;
		this.errorCount = 0;
	}

	public void testStarted()
	{
		this.runCount = this.runCount + 1;
	}

	public void testFailed()
	{
		this.errorCount = this.errorCount + 1;
	}

	public String summary()
	{
		return String.format("%d run, %d failed", this.runCount,
				this.errorCount);
	}

}
