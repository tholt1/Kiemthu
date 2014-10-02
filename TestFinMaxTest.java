
import junit.framework.Assert;

import org.junit.Test;

public class TestFinMaxTest {

	@Test
	public void testCase1() {
		TestFinMax tfMax = new TestFinMax();
		Assert.assertEquals(tfMax.callTargetFunction(0, 1, 1),
				UnitTestReturnValues.noException);
	}

	@Test
	public void testCase2() {
		TestFinMax tfMax = new TestFinMax();
		Assert.assertEquals(tfMax.callTargetFunction(1, -1, 1),
				UnitTestReturnValues.noException);
	}

	@Test
	public void testCase3() {
		TestFinMax tfMax = new TestFinMax();
		Assert.assertEquals(tfMax.callTargetFunction(9, 6, -1),
				UnitTestReturnValues.noException);
	}

	@Test
	public void testCase4() {
		TestFinMax tfMax = new TestFinMax();
		Assert.assertEquals(tfMax.callTargetFunction(9, 15, 12),
				UnitTestReturnValues.noException);
	}

	@Test
	public void testCase5() {
		TestFinMax tfMax = new TestFinMax();
		Assert.assertEquals(tfMax.callTargetFunction(9, 15, 18),
				UnitTestReturnValues.noException);
	}

	@Test
	public void testCase6() {
		TestFinMax tfMax = new TestFinMax();
		Assert.assertEquals(tfMax.callTargetFunction(9, 9, 9),
				UnitTestReturnValues.noException);
	}

	@Test
	public void testCase7() {
		TestFinMax tfMax = new TestFinMax();
		Assert.assertEquals(tfMax.callTargetFunction(9, 9, 12),
				UnitTestReturnValues.noException);
	}

}
