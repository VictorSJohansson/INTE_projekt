
package org.test.framework.core.runtime.features;

import org.test.framework.core.runtime.TestResult;

public interface TestFrameworkExecutable {

	TestResult execute(Class<?>... cl);

}
