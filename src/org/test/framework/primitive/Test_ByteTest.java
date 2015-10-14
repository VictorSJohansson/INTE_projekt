package org.test.framework.primitive;

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

public class Test_ByteTest {
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_Test() {
        assertTrue(Test_Byte.byte_Equals(Byte.MAX_VALUE, Byte.MAX_VALUE));
        assertFalse(Test_Byte.byte_Equals(Byte.MAX_VALUE, Byte.MIN_VALUE));
        
    }
	
	@Test
	public void Greater_Test() {
		assertTrue(Test_Byte.byte_Greater((byte)1, (byte)0));
		assertFalse(Test_Byte.byte_Greater((byte)0, (byte)0));
		assertFalse(Test_Byte.byte_Greater((byte)0, (byte)1));
	}
	
	@Test
	public void Lesser_Test() {
		assertTrue(Test_Byte.byte_Lesser((byte)0, (byte)1));
		assertFalse(Test_Byte.byte_Lesser((byte)0, (byte)0));
		assertFalse(Test_Byte.byte_Lesser((byte)1, (byte)0));
	}
	
	
}
