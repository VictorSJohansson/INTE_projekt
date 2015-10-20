package src.org.test.framework.primitive;

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

public class TestShortTest {
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_Test() {
        assertTrue(TestShort.short_Equals(Short.MAX_VALUE, Short.MAX_VALUE));
        assertFalse(TestShort.short_Equals(Short.MAX_VALUE, Short.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test() {
		assertTrue(TestShort.short_Greater((short)1, (short)0));
		assertFalse(TestShort.short_Greater((short)0, (short)0));
		assertFalse(TestShort.short_Greater((short)0, (short)1));
	}
	
	@Test
	public void less_Test() {
		assertTrue(TestShort.short_Less((short)0, (short)1));
		assertFalse(TestShort.short_Less((short)0, (short)0));
		assertFalse(TestShort.short_Less((short)1, (short)0));
	}
	
	@Test
	public void divisor_Test() {
		short x = 1;
		short y = (short) (x * 2);
		assertTrue(TestShort.short_Divisor(x, y));
		assertFalse(TestShort.short_Divisor(y, x));
	}
	
	@Test
	public void valueWithinByteRange_Test() {
		short x = Byte.MAX_VALUE + 1;
		assertFalse(TestShort.valueWithinByteRange(x));
		x = Byte.MIN_VALUE - 1;
		assertFalse(TestShort.valueWithinByteRange(x));
		x = 0;
		assertTrue(TestShort.valueWithinByteRange(x));
	}
}
