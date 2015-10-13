
package org.test.framework.core.runtime;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Runtime {

	public List<String> getListOfAnnotationMethod(Class<?>... cl)
	{
		List<String> l = new ArrayList<>();

		for (Class<?> c : cl)
		{
			Method[] m = c.getMethods();

			for (Method met : m)
			{
				if (met.isAnnotationPresent(OurTest.class))
					l.add(met.getName());
			}
		}

		return l;
	}
}
