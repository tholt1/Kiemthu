import static org.junit.Assert.*;

import junit.framework.Assert;

import org.junit.Test;


public class testTriangle {

	@Test
	public void testCheckTriangle1() throws Exception {
		Triangle t = new Triangle(4, 1, 2);
		int expected = -1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCheckTriangle2() throws Exception {
		Triangle t = new Triangle(1, 1, 1);
		int expected = 0;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCheckTriangle3() throws Exception {
		Triangle t = new Triangle(1, 2, 4);
		int expected = -1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCheckTriangle4() throws Exception {
		Triangle t = new Triangle(5, 5, 5);
		int expected = 2;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCheckTriangle5() throws Exception {
		Triangle t = new Triangle(2, 2, 3);
		int expected = 1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCheckTriangle6() throws Exception {
		Triangle t = new Triangle(2, 3, 2);
		int expected = 1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCheckTriangle7() throws Exception {
		Triangle t = new Triangle(3, 2, 2);
		int expected = 1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCheckTriangle8() throws Exception {
		Triangle t = new Triangle(3, 4, 5);
		int expected = 0;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
	}
}

