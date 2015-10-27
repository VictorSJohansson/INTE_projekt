package org.framework.primitive.tests;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_DoubleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestDoubleTest
{
    /**
     * This method tests if double_Equals(x,y) works.
     */
    @Test
    public void equals_Test()
    {
        assertTrue(TestDouble.equals(1.5, 1.5));
        
    }
    
     /**
     * This method tests if double_Greater(x,y) works.
     */
    @Test
    public void greater_Test()
    {
        assertTrue(TestDouble.greater(1.5, 1.4));
        
    }
    
    /**
     * This method tests if double_Less(x,y) works.
     */
    @Test
    public void less_Test()
    {
        assertTrue(TestDouble.less(1.3, 1.4));
       
    }
    
    /**
     * This method tests if double_IntegerValue(x,y) works.
     */
    @Test
    public void integerValue_Test()
    {
        assertFalse(TestDouble.equalIntegerValue(2.3, 1.4));
    }
    
    @Test
	public void valueWithinFloatRange_Test() { //added by John Thorelli 20/10/2015
		double x = Float.MAX_VALUE + 1;
		assertFalse(TestDouble.valueWithinFloatRange(x));
		x = Float.MIN_VALUE - 1;
		assertFalse(TestDouble.valueWithinFloatRange(x));
		x = 0;
		assertTrue(TestDouble.valueWithinFloatRange(x));
	}
}

