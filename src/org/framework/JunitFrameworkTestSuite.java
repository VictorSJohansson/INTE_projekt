package org.framework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.framework.core.test.JunitRuntimeTestSuite;
import org.framework.object.tests.JunitObjectTestSuite;
import org.framework.primitive.tests.JunitPrimitiveTestSuite;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ JunitRuntimeTestSuite.class, JunitObjectTestSuite.class, JunitPrimitiveTestSuite.class })
public class JunitFrameworkTestSuite {

}
