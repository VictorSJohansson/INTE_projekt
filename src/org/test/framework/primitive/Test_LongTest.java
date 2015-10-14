package org.test.framework.primitive;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * @author Victor Johansson
 * @version 14-10-2015
 */

public class Test_LongTest {
	
	/*
	 * This test checks if the long_Equals method works.
	 */
	@Test
	public void equalsTest(){
		assertTrue(Test_Long.long_Equals(1234567, 1234567));	
	}
	
	/*
	 * Tests if long_Greater works.
	 */
	@Test
	public void greaterTest(){
		assertTrue(Test_Long.long_Greater(234567, 234566));
	}
	
	/*
	 * This test checks to see if long_Less works.
	 */
	@Test
	public void lessTest(){
		assertTrue(Test_Long.long_Less(123456, 12345));
	}

}
