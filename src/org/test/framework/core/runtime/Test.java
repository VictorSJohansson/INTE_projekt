package org.test.framework.core.runtime;

import java.lang.reflect.Method;

public class Test extends TestEngine{



	protected Test(String methodName)
	{
		super(methodName);
		// TODO Auto-generated constructor stub
	}

	@OurTest
	public void testOurMethod()
	{
		System.out.println("test");
		assertIntegers(5,6);
	}
	
	public boolean assertIntegers(int x, int y)
	{System.out.println("test2");
		return x == y;
	}
	
	public static void main(String[] args)
	{
//		try
//		{
//			Method[] m = Test.class.getMethods();
//			
//			for(Method met : m)
//			{
//				if(met.isAnnotationPresent(OurTest.class))
//				{
//					new Test(met.getName()).run();
//				}
//			}
////			OurTest ot = m.getAnnotation(OurTest.class);	
//		}
//		catch (SecurityException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		new Test("testOurMethod").test();
	}
	
	public void test()
	{
		this.execute(Test.class);
	}
	
}
