
package org.framework.object.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ JunitTest_MathematicalObjectsTest.class, JunitLaserDomeTest.class, JunitPolynomialTest.class,
	JunitSecond_Degree_PolynomialTest.class, JunitTest_polynomialsTest.class,
	JunitTest_Second_Degree_PolynomialsTest.class })
public class JunitObjectTestSuite {

}