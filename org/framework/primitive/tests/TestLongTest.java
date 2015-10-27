package org.framework.primitive.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.framework.primitive.*;

/*
 * @author Victor Johansson
 * @version 14-10-2015
 */

public class TestLongTest {
	
	/*
	 * This test checks if the long_Equals method works.
	 */
	@Test
	public void equalsTest(){
		assertTrue(TestLong.equals(1234567, 1234567));	
	}
	
	/*
	 * Tests if long_Greater works.
	 */
	@Test
	public void greaterTest(){
		assertTrue(TestLong.greater(234567, 234566));
	}
	
	/*
	 * This test checks to see if long_Less works.
	 */
	@Test
	public void lessTest(){
		assertTrue(TestLong.less(123456, 12345));
	}

    @Test
    public void divisor_Test() { //added by John Thorelli 20/10/2015
    	long x = 1;
		long y = (long) (x * 2);
		assertTrue(TestLong.divisor(x, y));
		assertFalse(TestLong.divisor(y, x));      
    }
    
	@Test
	public void valueWithinIntRange_Test() { //added by John Thorelli 20/10/2015
		long x = Integer.MAX_VALUE + 1;
		assertFalse(TestLong.valueWithinIntRange(x));
		x = Integer.MIN_VALUE - 1;
		assertFalse(TestLong.valueWithinIntRange(x));
		x = 0;
		assertTrue(TestLong.valueWithinIntRange(x));
	}
	
	@Test
	public void valueWithinShortRange_Test() { //added by John Thorelli 20/10/2015
		long x = Short.MAX_VALUE + 1;
		assertFalse(TestLong.valueWithinShortRange(x));
		x = Short.MIN_VALUE - 1;
		assertFalse(TestLong.valueWithinShortRange(x));
		x = 0;
		assertTrue(TestLong.valueWithinShortRange(x));
	}
	
	@Test
	public void valueWithinByteRange_Test() { //added by John Thorelli 20/10/2015
		long x = Byte.MAX_VALUE + 1;
		assertFalse(TestLong.valueWithinByteRange(x));
		x = Byte.MIN_VALUE - 1;
		assertFalse(TestLong.valueWithinByteRange(x));
		x = 0;
		assertTrue(TestLong.valueWithinByteRange(x));
	}
}
