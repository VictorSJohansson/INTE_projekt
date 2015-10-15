
package org.test.framework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.test.framework.core.runtime.RuntimeTestSuite;

import org.test.framework.object.Test_MathematicalObjectsTest;
import org.test.framework.primitive.PrimitiveTestSuite;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ RuntimeTestSuite.class, Test_MathematicalObjectsTest.class, PrimitiveTestSuite.class })
public class FrameworkTestSuite {

}
