package src.org.test.framework.primitive;

/**
 * The test class Test_Short.
 *
 * @author  (John Thorelli)
 * @version (14-10-2015)
 */

public class TestShort extends Primitive {

	public static boolean short_Equals(short x, short y) {
		// TODO Auto-generated method stub
		return y == x;
	}

	public static boolean short_Greater(short x, short y) {
		// TODO Auto-generated method stub
		return x > y;
	}
	
	public static boolean short_Less(short x, short y) {
		// TODO Auto-generated method stub
		return x < y;
	}

	public static boolean short_Divisor(short x, short y) {
		// TODO Auto-generated method stub
		return y%x == 0;
	}

	public static boolean valueWithinByteRange(short x) {
		// TODO Auto-generated method stub
		if(x < Byte.MIN_VALUE || x > Byte.MAX_VALUE)
			return false;
		return true;
	}
}
