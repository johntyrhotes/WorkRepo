package JunitTasks;

import org.junit.Test;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;



//@RunWith(Suite.class)
//@Suite.SuiteClasses({Junit1.class,Junit2.class})
public class ExecuteAll {
	
	@Test
	public void test() {
		Result res=JUnitCore.runClasses(JunitTry1.class,JunitTry2.class);

	}

}
