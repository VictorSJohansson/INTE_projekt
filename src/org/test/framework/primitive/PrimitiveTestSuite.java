
package org.test.framework.primitive;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.test.framework.core.runtime.RuntimeTestSuite;
import org.test.framework.object.ObjectTestSuite;
import org.test.framework.primitive.PrimitiveTestSuite;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ TestBooleanTest.class, TestByteTest.class, TestCharTest.class,
		TestDoubleTest.class, TestFloatTest.class, TestIntTest.class,
		TestLongTest.class, TestPrimitive.class, TestShortTest.class })
public class PrimitiveTestSuite {

}