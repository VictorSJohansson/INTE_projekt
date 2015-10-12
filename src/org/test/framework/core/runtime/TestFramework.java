package org.test.framework.core.runtime;


public interface TestFramework {

	void setup();
	void tearDown();
	void run();
	void execute(Class<?>... cl);
}
