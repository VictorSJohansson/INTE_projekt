
package org.test.framework;

import org.test.framework.core.runtime.OurTest;
import org.test.framework.core.runtime.Test;

public class TestClassWithSetup implements Test {

	public boolean setup = false;
	
	@Override
	public void setup()
	{
		setup = true;
	}

	@Override
	public void teardown()
	{
		// TODO Auto-generated method stub
	}

	@OurTest
	public void testMethod()
	{

	}

}
