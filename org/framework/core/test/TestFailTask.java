import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;


public class TestFailTask {
	
	FailTask task;
	
	@Before
	public void initialize(){
		task = new FailTask(null);
	}
	
	@Test
	public void testFailTaskConstructorIsNull_NullTestName(){
		assertThat(task.getTaskName(), IsNull.nullValue());
	}

	@Test
	public void testFailTaskTestName_TestNameIsCorrect(){
		FailTask task = new FailTask("test");
		assertEquals(FailTask.getTaskName(), "test");
	}
}
