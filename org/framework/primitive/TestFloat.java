package org.framework.primitive;

/**
 * The test class Test_Float.
 *
 * @author  (John Thorelli)
 * @version (16-10-2015)
 */
public class TestFloat {

	public static boolean equals(float x, float y) {
		// TODO Auto-generated method stub
		return y == x;
	}

	public static boolean greater(float x, float y) {
		// TODO Auto-generated method stub
		return x > y;
	}
	
	public static boolean less(float x, float y) {
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
