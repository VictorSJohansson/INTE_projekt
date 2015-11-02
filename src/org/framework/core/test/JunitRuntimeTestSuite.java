
package org.framework.core.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ JunitTestRuntime.class, JunitTestCaseTest.class, JunitTestFailTask.class,
		JunitTestLogEntry.class, JunitTestSubtask.class,
		JunitTestSuccessfulTask.class, JunitTestTestLogger.class })
public class JunitRuntimeTestSuite {

}
