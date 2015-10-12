
package org.test.framework.core.runtime.book_example;

public class WasRun extends TestCase {

	boolean wasRun;
	boolean wasSetUp;

	String log;

	public WasRun(String name)
	{
		super(name);
		wasRun = false;
		wasSetUp = false;
	}

	public void setUp()
	{
		this.wasRun = false;
		this.wasSetUp = true;
		this.log = "setUp ";
	}

	public void testMethod()
	{
		this.wasRun = true;
		this.log = this.log + "testMethod ";
	}

	public void tearDown()
	{
		this.log = this.log + "tearDown ";
	}

	public void testBrokenMethod() throws Exception
	{
		throw new Exception("");
	}

	// public static void main(String[] args)
	// {
	// WasRun wr = new WasRun("testMethod");
	// System.out.println(wr.wasRun);
	// wr.run();
	// System.out.println(wr.wasRun);
	// }

}
