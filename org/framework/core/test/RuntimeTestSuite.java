package org.framework.core.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ TestRuntime.class, TestCaseTest.class })
public class RuntimeTestSuite {

}
