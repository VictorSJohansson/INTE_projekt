
package org.test.framework.primitive;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ TestBooleanTest.class, TestByteTest.class, TestDoubleTest.class,
		TestIntTest.class, TestLongTest.class })
public class PrimitiveTestSuite {
	
	//Booleans******************************************************************************************
	
	//tests boolean_Equals
	@Test
	public void equals_Test(){
		assertTrue(Primitive.equals(true, true));
	}
	
	//tests boolean_NotEquals
	@Test
	public void notEquals_Test(){
		assertTrue(Primitive.notEquals(true, false));
	}
	
	//Byte**********************************************************************************************
	
	@Test //Tests the functionality of equals_Test()  
    public void equals_Test() {
        assertTrue(Primitive.byte_Equals(Byte.MAX_VALUE, Byte.MAX_VALUE));
        assertFalse(Primitive.byte_Equals(Byte.MAX_VALUE, Byte.MIN_VALUE));
        
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
	
	//Long**********************************************************************************************
	
	//Float*********************************************************************************************
	
	//Doubble*******************************************************************************************
	
	//Char**********************************************************************************************
}