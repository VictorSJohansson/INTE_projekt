package org.test.framework.primitive;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test_CharTest.
 *
 * @author  Pinar Larsson
 * @version 15/10/2015
 */
public class Test_CharTest
{
	/**
	 * Tests if equals_Char() method works properly.
	 *
	 */
	@Test
	public void test_equals_Char()
	{
		assertTrue(Test_Char.equals_Char('a','a'));
	}
}
