package org.framework.core.test.target;

import org.framework.core.runtime.OurFramework;

public class TestClassException {

	@OurFramework
	public void testMethod() throws Exception
	{
		throw new Exception();
	}
	
}
