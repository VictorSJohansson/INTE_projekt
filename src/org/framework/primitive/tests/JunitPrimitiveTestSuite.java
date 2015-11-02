
package org.framework.primitive.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ JunitTestBooleanTest.class, JunitTestByteTest.class, JunitTestCharTest.class,
		JunitTestDoubleTest.class, JunitTestFloatTest.class,
		JunitTestIntTest.class, JunitTestLongTest.class,
		JunitTestPrimitive.class, JunitTestShortTest.class })
public class JunitPrimitiveTestSuite {

}