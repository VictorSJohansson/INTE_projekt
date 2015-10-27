package org.framework.primitive.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_ByteTest.
 *
 * @author  (John Thorelli)
 * @version (14-10-2015)
 */

public class TestByteTest {
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_Test() {
        assertTrue(TestByte.equals(Byte.MAX_VALUE, Byte.MAX_VALUE));
        assertFalse(TestByte.equals(Byte.MAX_VALUE, Byte.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test() {
		assertTrue(TestByte.greater((byte)1, (byte)0));
		assertFalse(TestByte.greater((byte)0, (byte)0));
		assertFalse(TestByte.greater((byte)0, (byte)1));
	}
	
	@Test
	public void less_Test() {
		assertTrue(TestByte.less((byte)0, (byte)1));
		assertFalse(TestByte.less((byte)0, (byte)0));
		assertFalse(TestByte.less((byte)1, (byte)0));
	}
	
	@Test
	public void divisor_Test() {
		byte x = 1;
		byte y = (byte) (x * 2);
		assertTrue(TestByte.divisor(x, y));
		assertFalse(TestByte.divisor(y, x));
	}
}
