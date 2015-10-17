package org.test.framework.primitive;

/**
 * The test class Test_Float.
 *
 * @author  (John Thorelli)
 * @version (16-10-2015)
 */

public class Test_Float {

	public static boolean float_Equals(short x, float y) {
		// TODO Auto-generated method stub
		return y == x;
	}

	public static boolean float_Greater(float x, float y) {
		// TODO Auto-generated method stub
		return x > y;
	}
	
	public static boolean float_Less(float x, float y) {
		// TODO Auto-generated method stub
		return x < y;
	}

	public static boolean sameIntegerValue(float x, float y) {
		// TODO Auto-generated method stub
        int a = (int) x;
        int b = (int) y;
        return a == b;
    }
}
