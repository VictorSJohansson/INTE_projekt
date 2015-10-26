
package org.test.framework.primitive;

import static org.junit.Assert.*;

import org.test.framework.core.runtime.TestLogger;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class testPrimitive {
	
	int failCount = 0;

	
	/*@Before
	public void initialize()
	{
		logCount = 0;
	}*/
	//Booleans******************************************************************************************
	
	//tests boolean_Equals
	@Test
	public void testequalsTestBoolean(){
		Primitive.equals(true, true);
		assertThat(failCount, is(TestLogger.getSize()));
	}
	
	//tests boolean_NotEquals
	@Test
	public void notEquals_Test(){
		Primitive.notEquals(true, false);
		assertThat(failCount, is(TestLogger.getSize()));
	}
	
	//Byte**********************************************************************************************
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_TestByte() {
		Primitive.equals(Byte.MAX_VALUE, Byte.MAX_VALUE);
		assertThat(failCount, is(TestLogger.getSize()));
		Primitive.equals(Byte.MIN_VALUE, Byte.MAX_VALUE);
		failCount++;
		assertThat(logCount, is(TestLogger.getSize()));
		System.out.println(TestLogger.getSize());
       // assertEquals(logCount, TestLogger.getSize());
        //assertFalse(Primitive.byte_Equals(Byte.MAX_VALUE, Byte.MIN_VALUE));
      //  assertEquals(logCount, TestLogger.getSize());
        
    }
	
	@Test
	public void greater_Test() {
		assertTrue(Primitive.greater((byte)1, (byte)0));
		assertFalse(Primitive.greater((byte)0, (byte)0));
		assertFalse(Primitive.greater((byte)0, (byte)1));
	}
	
	@Test
	public void less_Test() {
		assertTrue(Primitive.less((byte)0, (byte)1));
		assertFalse(Primitive.less((byte)0, (byte)0));
		assertFalse(Primitive.less((byte)1, (byte)0));
	}
	
	@Test
	public void divisor_Test() {
		byte x = 1;
		byte y = (byte) (x * 2);
		assertTrue(Primitive.divisor(x, y));
		assertFalse(Primitive.divisor(y, x));
	}
	
	//Short*********************************************************************************************
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_Test() {
        assertTrue(Primitive.short_Equals(Short.MAX_VALUE, Short.MAX_VALUE));
        assertFalse(Primitive.short_Equals(Short.MAX_VALUE, Short.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test() {
		assertTrue(Primitive.greater((short)1, (short)0));
		assertFalse(Primitive.greater((short)0, (short)0));
		assertFalse(Primitive.greater((short)0, (short)1));
	}
	
	@Test
	public void less_Test() {
		assertTrue(Primitive.less((short)0, (short)1));
		assertFalse(Primitive.less((short)0, (short)0));
		assertFalse(Primitive.less((short)1, (short)0));
	}
	
	@Test
	public void divisor_Test() {
		short x = 1;
		short y = (short) (x * 2);
		assertTrue(Primitive.divisor(x, y));
		assertFalse(Primitive.divisor(y, x));
	}
	
	@Test
	public void valueWithinByteRange_Test() {
		short x = Byte.MAX_VALUE + 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = Byte.MIN_VALUE - 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinByteRange(x));
	}
	
	//Int***********************************************************************************************
	
    /**
     * This method tests if int_Equals(x,y) works.
     */
    @Test
    public void equals_Test()
    {
        assertTrue(Primitive.int_Equals(Integer.MAX_VALUE,Integer.MAX_VALUE));
        
    }
    
    
    /**
     * This method tests if int_Greater(x,y) works.
     */
    @Test
    public void greater_Test()
    {
        assertTrue(Primitive.int_Greater(5,3));
        
    }
    
     /**
     * This method tests if int_Less(x,y) works.
     */
    @Test
    public void less_Test()
    {
        assertTrue(Primitive.int_Less(3,5));
        
    }
    
     /**
     * This method tests if int_Divisor(x,y) works.
     */
    @Test
    public void divisor_Test()
    {
        assertTrue(Primitive.int_Divisor(3,6));
        
    }
    
	@Test
	public void valueWithinShortRange_Test() { //added by John Thorelli 20/10/2015
		int x = Short.MAX_VALUE + 1;
		assertFalse(Primitive.valueWithinShortRange(x));
		x = Short.MIN_VALUE - 1;
		assertFalse(Primitive.valueWithinShortRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinShortRange(x));
	}
	
	@Test
	public void valueWithinByteRange_Test() { //added by John Thorelli 20/10/2015
		int x = Byte.MAX_VALUE + 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = Byte.MIN_VALUE - 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinByteRange(x));
	}
	
	//Long**********************************************************************************************
	
	/*
	 * This test checks if the long_Equals method works.
	 */
	@Test
	public void equalsTest(){
		assertTrue(Primitive.equals(1234567, 1234567));	
	}
	
	/*
	 * Tests if long_Greater works.
	 */
	@Test
	public void greaterTest(){
		assertTrue(Primitive.greater(234567, 234566));
	}
	
	/*
	 * This test checks to see if long_Less works.
	 */
	@Test
	public void lessTest(){
		assertTrue(Primitive.less(123456, 12345));
	}

    @Test
    public void divisor_Test() { //added by John Thorelli 20/10/2015
    	long x = 1;
		long y = (long) (x * 2);
		assertTrue(Primitive.divisor(x, y));
		assertFalse(Primitive.divisor(y, x));      
    }
    
	@Test
	public void valueWithinIntRange_Test() { //added by John Thorelli 20/10/2015
		long x = Int.MAX_VALUE + 1;
		assertFalse(Primitive.valueWithinIntRange(x));
		x = Int.MIN_VALUE - 1;
		assertFalse(Primitive.valueWithinIntRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinIntRange(x));
	}
	
	@Test
	public void valueWithinShortRange_Test() { //added by John Thorelli 20/10/2015
		long x = Short.MAX_VALUE + 1;
		assertFalse(Primitive.valueWithinShortRange(x));
		x = Short.MIN_VALUE - 1;
		assertFalse(Primitive.valueWithinShortRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinShortRange(x));
	}
	
	@Test
	public void valueWithinByteRange_Test() { //added by John Thorelli 20/10/2015
		long x = Byte.MAX_VALUE + 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = Byte.MIN_VALUE - 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinByteRange(x));
	}
	
	//Float*********************************************************************************************
	
	public void equals_Test() {
        assertTrue(Primitive.float_Equals(Float.MAX_VALUE, Float.MAX_VALUE));
        assertFalse(Primitive.float_Equals(Float.MAX_VALUE, Float.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test() {
		assertTrue(Primitive.greater((float)1, (float)0));
		assertFalse(Primitive.greater((float)0, (float)0));
		assertFalse(Primitive.greater((float)0, (float)1));
	}
	
	@Test
	public void less_Test() {
		assertTrue(Primitive.less((float)0, (float)1));
		assertFalse(Primitive.less((float)0, (float)0));
		assertFalse(Primitive.less((float)1, (float)0));
	}
	
	@Test
	public void sameIntegerValue_Test() {
		assertTrue(Primitive.sameIntegerValue((float)5.3, (float)5.7));
		assertFalse(Primitive.sameIntegerValue((float)8.5, (float)8.5));
	}
	
	//Doubble*******************************************************************************************
	
    /**
     * This method tests if double_Equals(x,y) works.
     */
    @Test
    public void equals_Test()
    {
        assertTrue(Primitive.equals(1.5, 1.5));
        
    }
    
     /**
     * This method tests if double_Greater(x,y) works.
     */
    @Test
    public void greater_Test()
    {
        assertTrue(Primitive.greater(1.5, 1.4));
        
    }
    
    /**
     * This method tests if double_Less(x,y) works.
     */
    @Test
    public void less_Test()
    {
        assertTrue(Primitive.less(1.3, 1.4));
       
    }
    
    /**
     * This method tests if double_IntegerValue(x,y) works.
     */
    @Test
    public void integerValue_Test()
    {
        assertTrue(Primitive.equalIntegerValue(2.3, 1.4));
       
    }
    
    @Test
	public void valueWithinFloatRange_Test() { //added by John Thorelli 20/10/2015
		double x = Float.MAX_VALUE + 1;
		assertFalse(Primitive.valueWithinFloatRange(x));
		x = Float.MIN_VALUE - 1;
		assertFalse(Primitive.valueWithinFloatRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinFloatRange(x));
	}
	
	//Char**********************************************************************************************
    
	/**
	 * Tests if equals_Char() method works properly.
	 *
	 */
	@Test
	public void equals_Test()
	{
		assertTrue(TestChar.equals('a','a'));
		assertFalse(TestChar.equals('a','b'));
	}
}