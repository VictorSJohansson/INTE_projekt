package org.framework.primitive.tests;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.framework.primitive.*;

/**
 * The test class Test_IntTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JunitTestIntTest
{

    /**
     * This method tests if int_Equals(x,y) works.
     */
    @Test
    public void equals_Test()
    {
        assertTrue(TestInt.equals(Integer.MAX_VALUE,Integer.MAX_VALUE));
        
    }
    
    
    /**
     * This method tests if int_Greater(x,y) works.
     */
    @Test
    public void greater_Test()
    {
        assertTrue(TestInt.greater(5,3));
        
    }
    
     /**
     * This method tests if int_Less(x,y) works.
     */
    @Test
    public void less_Test()
    {
        assertTrue(TestInt.less(3,5));
        
    }
    
     /**
     * This method tests if int_Divisor(x,y) works.
     */
    @Test
    public void divisor_Test()
    {
        assertTrue(TestInt.divisor(3,6));
        
    }
    
	@Test
	public void valueWithinShortRange_Test() { //added by John Thorelli 20/10/2015
		int x = Short.MAX_VALUE + 1;
		assertFalse(TestInt.valueWithinShortRange(x));
		x = Short.MIN_VALUE - 1;
		assertFalse(TestInt.valueWithinShortRange(x));
		x = 0;
		assertTrue(TestInt.valueWithinShortRange(x));
	}
	
	@Test
	public void valueWithinByteRange_Test() { //added by John Thorelli 20/10/2015
		int x = Byte.MAX_VALUE + 1;
		assertFalse(TestInt.valueWithinByteRange(x));
		x = Byte.MIN_VALUE - 1;
		assertFalse(TestInt.valueWithinByteRange(x));
		x = 0;
		assertTrue(TestInt.valueWithinByteRange(x));
	}
}
