package ExtentReportsExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Functionality1 extends BaseTest {
	@Test
	public void functionality1Test1() {
	test = extent.createTest("functionality1Test1");
	Assert.assertTrue(1 > 0);
	}

	@Test
	public void functionality1Test2() {
		test = extent.createTest("functionality1Test2");
		Assert.assertEquals("xx", "xx");
	}

	@Test
	public void functionality1Test3() {
		test = extent.createTest("functionality1Test3");
		Assert.assertEquals("xx", "xx");
	}
}