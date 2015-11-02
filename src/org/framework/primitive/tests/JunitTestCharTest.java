package org.framework.primitive.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.framework.primitive.*;

/**
 * The test class Test_CharTest.
 *
 * @author  Pinar Larsson
 * @version 15/10/2015
 */
public class JunitTestCharTest
{
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