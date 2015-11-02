package org.framework.tests.target;

import org.framework.core.runtime.OurFramework;
import org.framework.object.Polynomial;
import org.framework.primitive.Primitive;

public class TestClassForMain {
	
	@OurFramework
	public void testOurPrimitiveClass()
	{
		Primitive.less(4, 5);
		Primitive.less(5, 4);
	
		Primitive.equals(5, 5);
		Primitive.equals(4, 6);
	
		Primitive.valueWithinByteRange(15);
		Primitive.valueWithinByteRange(1000);
		Primitive.valueWithinByteRange(-1);
	}
}
