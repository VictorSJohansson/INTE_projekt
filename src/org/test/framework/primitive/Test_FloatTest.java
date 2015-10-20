package org.test.framework.primitive;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test case for Test_Float.
 *
 * @author  (John Thorelli)
 * @version (16-10-2015)
 */
public class Test_FloatTest {
	
    public void equals_Test() {
        assertTrue(Test_Float.float_Equals(Float.MAX_VALUE, Float.MAX_VALUE));
        assertFalse(Test_Float.float_Equals(Float.MAX_VALUE, Float.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test() {
		assertTrue(Test_Float.float_Greater((float)1, (float)0));
		assertFalse(Test_Float.float_Greater((float)0, (float)0));
		assertFalse(Test_Float.float_Greater((float)0, (float)1));
	}
	
	@Test
	public void less_Test() {
		assertTrue(Test_Float.float_Less((float)0, (float)1));
		assertFalse(Test_Float.float_Less((float)0, (float)0));
		assertFalse(Test_Float.float_Less((float)1, (float)0));
	}
	
	@Test
	public void sameIntegerValue_Test() {
		assertTrue(Test_Float.sameIntegerValue((float)5.3, (float)5.7));
		assertFalse(Test_Float.sameIntegerValue((float)8.5, (float)8.5));
	}
}

