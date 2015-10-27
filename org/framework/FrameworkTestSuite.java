package org.framework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.framework.core.test.RuntimeTestSuite;
import org.framework.object.ObjectTestSuite;
import org.framework.primitive.PrimitiveTestSuite;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ RuntimeTestSuite.class, ObjectTestSuite.class, PrimitiveTestSuite.class })
public class FrameworkTestSuite {

}
