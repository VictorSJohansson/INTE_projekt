
package org.test.framework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.test.framework.core.runtime.TestCaseTest;
import org.test.framework.core.runtime.TestRuntime;

import org.test.framework.object.Test_MathematicalObjectsTest;
import org.test.framework.primitive.*;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ TestRuntime.class, TestCaseTest.class, Test_MathematicalObjectsTest.class,
		Test_BooleanTest.class, Test_ByteTest.class, Test_DoubleTest.class,
		Test_IntTest.class, Test_LongTest.class })
public class FrameworkSuite {

}
