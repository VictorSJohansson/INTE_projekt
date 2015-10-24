package org.test.framework.primitive;

/**
 * 
 * @author Victor Johansson
 * @version 13/10/2015
 *
 */
public class TestBoolean extends Primitive{
	
	//compare two booleans, return true if equal
	public static boolean equals(boolean x, boolean y){
		int a = Boolean.compare(x, y);
		if (a==0){
			return true;
		}
		else    
			return false;
	}
	
	//compare two booleans, return true if not equal
	public static boolean notEquals(boolean x, boolean y){
		int a = Boolean.compare(x,y);
		if(a!=0){
			return true; 
		}
		else
			return false; 
	}
}
