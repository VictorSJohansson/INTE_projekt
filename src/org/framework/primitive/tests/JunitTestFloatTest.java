package org.framework.primitive.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.framework.primitive.*;

/**
 * The test case for Test_Float.
 *
 * @author  (John Thorelli)
 * @version (16-10-2015)
 */
public class JunitTestFloatTest {
	
    public void equals_Test() {
        assertTrue(TestFloat.equals(Float.MAX_VALUE, Float.MAX_VALUE));
        assertFalse(TestFloat.equals(Float.MAX_VALUE, Float.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test() {
		assertTrue(TestFloat.greater((float)1, (float)0));
		assertFalse(TestFloat.greater((float)0, (float)0));
		assertFalse(TestFloat.greater((float)0, (float)1));
	}
	
	@Test
	public void less_Test() {
		assertTrue(TestFloat.less((float)0, (float)1));
		assertFalse(TestFloat.less((float)0, (float)0));
		assertFalse(TestFloat.less((float)1, (float)0));
	}
	
	@Test
	public void sameIntegerValue_Test() {
		assertTrue(TestFloat.sameIntegerValue((float)5.3, (float)5.7));
		assertFalse(TestFloat.sameIntegerValue((float)8.5, (float)9.1));
	}
}

