package org.framework.primitive.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ TestBooleanTest.class, TestByteTest.class, TestCharTest.class,
		TestDoubleTest.class, TestFloatTest.class, TestIntTest.class,
		TestLongTest.class, testPrimitive.class, TestShortTest.class })
public class PrimitiveTestSuite {

}