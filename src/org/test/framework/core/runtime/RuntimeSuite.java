package org.test.framework.core.runtime;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.*;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ TestRuntime.class, TestCaseTest.class })
public class RuntimeSuite {

}

