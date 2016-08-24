package TEST;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Class for Test Runner
 */
public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result = JUnitCore.runClasses(TestSuiteShape.class);
		for(Failure failure : result.getFailures())
			System.out.println(failure.toString());
		System.out.println(result.wasSuccessful());
	}

}
