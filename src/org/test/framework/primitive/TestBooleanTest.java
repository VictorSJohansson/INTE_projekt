package src.org.test.framework.primitive;

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

public class TestBooleanTest {
	
	//tests boolean_Equals
	@Test
	public void equals_Test(){
		assertTrue(Test_Boolean.equals(true, true));
	}
	
	//tests boolean_NotEquals
	@Test
	public void notEquals_Test(){
		assertTrue(Test_Boolean.notEquals(true, false));
	}

}
