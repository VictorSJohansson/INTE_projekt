
package org.test.framework.primitive;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ Test_BooleanTest.class, Test_ByteTest.class, Test_DoubleTest.class,
		Test_IntTest.class, Test_LongTest.class })
public class PrimitiveTestSuite {
	
	//tests boolean_Equals
	@Test
	public void equals_Test(){
		assertTrue(Test_Boolean.boolean_Equals(true, true));
	}
	
	//tests boolean_NotEquals
	@Test
	public void notEquals_Test(){
		assertTrue(Test_Boolean.boolean_NotEquals(true, false));
	}
}