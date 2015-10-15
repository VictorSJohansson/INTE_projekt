package org.test.framework.primitive;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for Test_Boolean.java
 * 
 * @author Victor Johansson
 * @version 13-10-2015
 */

public class Test_BooleanTest {
	
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
