
package org.test.framework.core.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * A simple Annotation which we use to scan the classes we want to run if they
 * contain it. The annotation can only be added to method and can be read at
 * runtime
 */

public @interface OurFramework
{
	static final Class<OurFramework> ANNOTATION = OurFramework.class;
}
