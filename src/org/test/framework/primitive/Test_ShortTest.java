package org.test.framework.primitive;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test case for Test_Short.
 *
 * @author  (John Thorelli)
 * @version (16-10-2015)
 */

public class Test_ShortTest {
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_Test() {
        assertTrue(Test_Short.short_Equals(Short.MAX_VALUE, Short.MAX_VALUE));
        assertFalse(Test_Short.short_Equals(Short.MAX_VALUE, Short.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test() {
		assertTrue(Test_Short.short_Greater((short)1, (short)0));
		assertFalse(Test_Short.short_Greater((short)0, (short)0));
		assertFalse(Test_Short.short_Greater((short)0, (short)1));
	}
	
	@Test
	public void less_Test() {
		assertTrue(Test_Short.short_Less((short)0, (short)1));
		assertFalse(Test_Short.short_Less((short)0, (short)0));
		assertFalse(Test_Short.short_Less((short)1, (short)0));
	}
	
	@Test
	public void divisor_Test() {
		short x = 1;
		short y = (short) (x * 2);
		assertTrue(Test_Short.short_Divisor(x, y));
		assertFalse(Test_Short.short_Divisor(y, x));
	}
	
	@Test
	public void valueWithinByteRange_Test() {
		short x = Byte.MAX_VALUE + 1;
		assertFalse(Test_Short.valueWithinByteRange(x));
		x = Byte.MIN_VALUE - 1;
		assertFalse(Test_Short.valueWithinByteRange(x));
		x = 0;
		assertTrue(Test_Short.valueWithinByteRange(x));
	}
}
