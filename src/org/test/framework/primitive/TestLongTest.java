package src.org.test.framework.primitive;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * @author Victor Johansson
 * @version 14-10-2015
 */

public class TestLongTest {
	
	/*
	 * This test checks if the long_Equals method works.
	 */
	@Test
	public void equalsTest(){
		assertTrue(TestLong.long_Equals(1234567, 1234567));	
	}
	
	/*
	 * Tests if long_Greater works.
	 */
	@Test
	public void greaterTest(){
		assertTrue(TestLong.long_Greater(234567, 234566));
	}
	
	/*
	 * This test checks to see if long_Less works.
	 */
	@Test
	public void lessTest(){
		assertTrue(TestLong.long_Less(123456, 12345));
	}

}
