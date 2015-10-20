
package org.test.framework.primitive;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ Test_BooleanTest.class, Test_ByteTest.class, Test_DoubleTest.class,
		Test_IntTest.class, Test_LongTest.class })
public class PrimitiveTestSuite {
	
}