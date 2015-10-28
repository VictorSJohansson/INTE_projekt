
package org.framework.object;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.framework.object.Test_MathematicalObjectsTest;

@RunWith(value = Suite.class)
@SuiteClasses(value =
{ Test_MathematicalObjectsTest.class, LaserDomeTest.class, PolynomialTest.class,
		Second_Degree_PolynomialTest.class, Test_polynomialsTest.class,
		Test_Second_Degree_PolynomialsTest.class })
public class ObjectTestSuite {

}