
package org.framework.core.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ TestRuntime.class, TestCaseTest.class, TestFailTask.class, TestLogEntry.class,
		TestSubtask.class, TestSuccessfulTask.class, TestTestLogger.class })
public class RuntimeTestSuite {

}
