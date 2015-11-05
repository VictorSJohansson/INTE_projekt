package org.framework.primitive.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.BeforeClass;

import org.framework.core.runtime.TestLogger;
import org.framework.primitive.*;

public class JunitTestPrimitive {
	
	
	@Test
	public void testIsANumber(){
		//assertTrue(Primitive.isANumber(1));
	}
	/*@Before
	public void initialize()
	{
		logCount = 0;
	}*/
	//Booleans******************************************************************************************
	
	//tests boolean_Equals
	@Test
	public void testequalsTestBoolean(){
		assertTrue(Primitive.equals(true, true));
		assertFalse(Primitive.equals(true,  false));
	}
	
	//tests boolean_NotEquals
	@Test
	public void notEquals_Test(){
		assertTrue(Primitive.notEquals(true, false));
		assertFalse(Primitive.notEquals(true,  true));
	}
	
	//Byte**********************************************************************************************
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_TestByte() {
		byte a = Byte.MAX_VALUE;
		byte b = Byte.MIN_VALUE;
		assertFalse(Primitive.equals(a, b));
		assertFalse(Primitive.equals(b, a));
		b = a;
		assertTrue(Primitive.equals(b, a));
		//Primitive.equals(Byte.MAX_VALUE, Byte.MAX_VALUE);
		//assertThat(failCount, is(TestLogger.getSize()));
		//Primitive.equals(Byte.MIN_VALUE, Byte.MAX_VALUE);
		//failCount++;
		//assertThat(failCount, is(TestLogger.getSize()));
		//System.out.println(TestLogger.getSize());
       // assertEquals(logCount, TestLogger.getSize());
        //assertFalse(Primitive.byte_Equals(Byte.MAX_VALUE, Byte.MIN_VALUE));
      //  assertEquals(logCount, TestLogger.getSize());
        
    }
	
	@Test
	public void greater_Test_Byte() {
		assertTrue(Primitive.greater((byte)1, (byte)0));
		assertFalse(Primitive.greater((byte)0, (byte)0));
		assertFalse(Primitive.greater((byte)0, (byte)1));
	}
	
	@Test
	public void less_Test_Byte() {
		assertTrue(Primitive.less((byte)0, (byte)1));
		assertFalse(Primitive.less((byte)0, (byte)0));
		assertFalse(Primitive.less((byte)1, (byte)0));
	}
	
	@Test
	public void divisor_Test_Byte() {
		byte x = 1;
		byte y = (byte) (x * 2);
		assertTrue(Primitive.divisor(x, y));
		assertFalse(Primitive.divisor(y, x));
	}
	
	
	
	//Short*********************************************************************************************
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_Short_Test() {
        assertTrue(Primitive.equals(Short.MAX_VALUE, Short.MAX_VALUE));
        assertFalse(Primitive.equals(Short.MAX_VALUE, Short.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test_Short() {
		assertTrue(Primitive.greater((short)1, (short)0));
		assertFalse(Primitive.greater((short)0, (short)0));
		assertFalse(Primitive.greater((short)0, (short)1));
	}
	
	@Test
	public void less_Test_Short() {
		assertTrue(Primitive.less((short)0, (short)1));
		assertFalse(Primitive.less((short)0, (short)0));
		assertFalse(Primitive.less((short)1, (short)0));
	}
	
	@Test
	public void divisor_Test_Short() {
		short x = 1;
		short y = (short) (x * 2);
		assertTrue(Primitive.divisor(x, y));
		assertFalse(Primitive.divisor(y, x));
	}
	
	@Test
	public void valueWithinByteRange_Test_Short() {
		short x = 100;
		assertTrue(Primitive.valueWithinByteRange(x));
		x = 128;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = -129;
		assertFalse(Primitive.valueWithinByteRange(x));
	}
	
	//Int***********************************************************************************************
	
    /**
     * This method tests if int_Equals(x,y) works.
     */
    @Test
    public void equals_Test_Int()
    {
    	int a = Integer.MAX_VALUE;
    	int b = Integer.MIN_VALUE;
        assertFalse(Primitive.equals(a, b));
        assertTrue(Primitive.equals(a, a));
        
    }
    
    
    /**
     * This method tests if int_Greater(x,y) works.
     */
    @Test
    public void greater_Test_Int()
    {
        assertTrue(Primitive.greater(5,3));
        assertFalse(Primitive.greater(3, 5));
        
    }
    
     /**
     * This method tests if int_Less(x,y) works.
     */
    @Test
    public void less_Test_Int()
    {
        assertTrue(Primitive.less(3,5));
        assertFalse(Primitive.less(5, 2));
        
    }
    
     /**
     * This method tests if int_Divisor(x,y) works.
     */
    @Test
    public void divisor_Test_Int()
    {
        assertTrue(Primitive.divisor(3,6));
        assertFalse(Primitive.divisor(6, 3));
        
    }
    
	@Test
	public void valueWithinShortRange_Test_Int() { //added by John Thorelli 20/10/2015
		int x = Short.MAX_VALUE;
		x += 1;
		assertFalse(Primitive.valueWithinShortRange(x));
		x = Short.MIN_VALUE;
		x -= 1;
		assertFalse(Primitive.valueWithinShortRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinShortRange(x));
	}
	
	@Test
	public void valueWithinByteRange_Test_Int() { //added by John Thorelli 20/10/2015
		int x = Byte.MAX_VALUE;
		x += 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = Byte.MIN_VALUE;
		x -= 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinByteRange(x));
	}
	
	//Long**********************************************************************************************
	
	/*
	 * This test checks if the long_Equals method works.
	 */
	@Test
	public void equals_Test_Long(){
		long x = 12345l;
		long y = 12345l;
		assertTrue(Primitive.equals(x, y));
		y=12346l;
		assertFalse(Primitive.equals(x,  y));
	}
	
	/*
	 * Tests if long_Greater works.
	 */
	@Test
	public void greater_Test_Long(){
		long x = Long.MAX_VALUE;
		long y = Long.MAX_VALUE-1;
		assertTrue(Primitive.greater(x, y));
		assertFalse(Primitive.greater(y, x));
	}
	
	/*
	 * This test checks to see if long_Less works.
	 */
	@Test
	public void less_Test_Long(){
		long x = 123455;
		long y = 123456;
		assertTrue(Primitive.less(x, y));
		assertFalse(Primitive.less(y,  x));
	}

    @Test
    public void divisor_Test_Long() { //added by John Thorelli 20/10/2015
    	long x = 1;
		long y = (long) (x * 2);
		assertTrue(Primitive.divisor(x, y));
		assertFalse(Primitive.divisor(y, x));      
    }
    
	@Test
	public void valueWithinIntRange_Test_Long() { //added by John Thorelli 20/10/2015
		long x = Integer.MAX_VALUE;
		x += 1;
		assertFalse(Primitive.valueWithinIntRange(x));
		x = Integer.MIN_VALUE;
		x -= 1;
		assertFalse(Primitive.valueWithinIntRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinIntRange(x));
	}
	
	@Test
	public void valueWithinShortRange_Test_Long() { //added by John Thorelli 20/10/2015
		long x = Short.MAX_VALUE;
		x += 1;
		assertFalse(Primitive.valueWithinShortRange(x));
		x = Short.MIN_VALUE;
		x -= 1;
		assertFalse(Primitive.valueWithinShortRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinShortRange(x));
	}
	
	@Test
	public void valueWithinByteRange_Test_Long() { //added by John Thorelli 20/10/2015
		long x = Byte.MAX_VALUE;
		x += 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = Byte.MIN_VALUE;
		x -= 1;
		assertFalse(Primitive.valueWithinByteRange(x));
		x = 0;
		assertTrue(Primitive.valueWithinByteRange(x));
	}
	
	//Float*********************************************************************************************
	
	public void equals_Test_Float() {
        assertTrue(Primitive.equals(Float.MAX_VALUE, Float.MAX_VALUE));
        assertFalse(Primitive.equals(Float.MAX_VALUE, Float.MIN_VALUE));
        
    }
	
	@Test
	public void greater_Test_Float() {
		assertTrue(Primitive.greater((float)1, (float)0));
		assertFalse(Primitive.greater((float)0, (float)0));
		assertFalse(Primitive.greater((float)0, (float)1));
	}
	
	@Test
	public void less_Test_Float() {
		assertTrue(Primitive.less((float)0, (float)1));
		assertFalse(Primitive.less((float)0, (float)0));
		assertFalse(Primitive.less((float)1, (float)0));
	}
	
	@Test
	public void sameIntegerValue_Test_Float() {
		assertTrue(Primitive.sameIntegerValue((float)5.3, (float)5.7));
		assertFalse(Primitive.sameIntegerValue((float)8.5, (float)9.5));
	}
	
	@Test
	public void testIsAFloatNumber(){
		float f = 3.1f;
		assertTrue(Primitive.isAFloatNumber(f));
		double d = 2.2;
		assertTrue(Primitive.isAFloatNumber(d));
		int i = 1;
		assertFalse(Primitive.isAFloatNumber(i));
	}
	
	//Doubble*******************************************************************************************
	
    /**
     * This method tests if double_Equals(x,y) works.
     */
    @Test
    public void equals_Test_Double()
    {
        assertTrue(Primitive.equals(1.5, 1.5));
        assertFalse(Primitive.equals(1.5, 1.2));
        
    }
    
     /**
     * This method tests if double_Greater(x,y) works.
     */
    @Test
    public void greater_Test_Double()
    {
        assertTrue(Primitive.greater(1.5, 1.4));
        assertFalse(Primitive.greater(1.4, 1.6));
        
    }
    
    /**
     * This method tests if double_Less(x,y) works.
     */
    @Test
    public void less_Test_Double()
    {
        assertTrue(Primitive.less(1.3, 1.4));
        assertFalse(Primitive.less(1.6, 1.3));
       
    }
    
    /**
     * This method tests if double_IntegerValue(x,y) works.
     */
    @Test
    public void integerValue_Test_Double()
    {
    	Double d1 = 2.3;
    	Double d2 = 2.4;
    	assertTrue(Primitive.equalIntegerValue(d1, d2));
    	d2 = 1.4;
        assertFalse(Primitive.equalIntegerValue(d1, d2));
    }
    
    @Test
	public void valueWithinFloatRange_Test_Double() { //added by John Thorelli 20/10/2015
		double x = (double) Float.MAX_VALUE;
		assertTrue(Primitive.valueWithinFloatRange(x));
		x = Double.MAX_VALUE;
		assertFalse(Primitive.valueWithinFloatRange(x));
		x = Double.MIN_VALUE;
		assertFalse(Primitive.valueWithinFloatRange(x));
	}
    
    @Test
    public void valueWithinIntRange_Test_Double(){	//added by Victor Johansson 3/11/2015
    	double x = 2.0;
    	assertTrue(Primitive.valueWithinIntRange(x));
    	x=Double.MAX_VALUE;
    	assertFalse(Primitive.valueWithinIntRange(x));
    }
	
	//Char**********************************************************************************************
    
	/**
	 * Tests if equals_Char() method works properly.
	 *
	 */
    
    @Test
    public void equals_Char_Test_Char(){
    	assertTrue(Primitive.equals('a', 'a'));
    	assertFalse(Primitive.equals('a', 'b'));
    }

	
	//Other*******************************************************************
	
	@Test
	public void equals_ShortFloat_Test(){
		short s = 2;
		float f = 2.0f;
		assertTrue(Primitive.equals(s, f));
		f = 2.1f;
		assertFalse(Primitive.equals(s, f));
	}
	
	@Test
	public void equals_ShortByte_Test(){
		short s = 2;
		byte b = 2;
		assertTrue(Primitive.equals(s, b));
		b = 3;
		assertFalse(Primitive.equals(s,  b));
	}
	
	@Test
	public void greater_Short_Byte(){
		short s = 10;
		byte b = 9;
		assertTrue(Primitive.greater(s, b));
		b = 11;
		assertFalse(Primitive.greater(s,  b));
	}
}