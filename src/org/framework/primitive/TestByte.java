package org.framework.primitive;

public class TestByte extends Primitive {

	public static boolean equals(byte x, byte y) {
		// TODO Auto-generated method stub
		return y == x;
	}

	public static boolean greater(byte x, byte y) {
		// TODO Auto-generated method stub
		return x > y;
	}
	
	public static boolean less(byte x, byte y) {
		// TODO Auto-generated method stub
		return x < y;
	}

	public static boolean divisor(byte x, byte y) {
		// TODO Auto-generated method stub
		return y%x == 0;
	}
}
