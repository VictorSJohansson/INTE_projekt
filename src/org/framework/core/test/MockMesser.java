package org.framework.core.test;

import org.framework.core.runtime.TestCase;

 class MockMesser {

	private String methodName;
	
	public void illegallyAccess(){
		methodName = "mahalo";
		System.out.println("Trying to illegally access");

	}
}
