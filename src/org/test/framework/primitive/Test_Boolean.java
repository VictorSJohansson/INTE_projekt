package org.test.framework.primitive;

/**
 * 
 * @author Victor Johansson
 * @version 13/10/2015
 *
 */
public class Test_Boolean extends Primitive{
	
	//compare two booleans, return true if equal
	public static void boolean_Equals(boolean x, boolean y){
		int a = Boolean.compare(x, y);
		if (a==0){
			return; //do something
		}
		else    
			return; //do something else
	}
	
	//compare two booleans, return true if not equal
	public static void boolean_NotEquals(boolean x, boolean y){
		int a = Boolean.compare(x,y);
		if(a!=0){
			return; //do something
		}
		else
			return; //do something else
	}
}
