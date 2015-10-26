
package org.test.framework.core.runtime;

/**
 * Test is an interface which allows a class to setup and teardown
 * before and after running a testcase
 * 
 * 
 * @author Sebastian de Rzewuski
 * @Contact Sebastian.de.Rzewuski@gmail.com
 * @Version 1.0
 */

public interface Test {

	void setup();

	void teardown();

}
