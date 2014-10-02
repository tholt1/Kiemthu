import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

public class testNextDate {

	@Test
	public void testcase1() throws Exception{
		NextDate day1 = new NextDate(2, 3, 2002);
		int actual =  day1.checkNextDate();
		int expected = 1;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase2() throws Exception{
		NextDate day1 = new NextDate(31, 3, 2002);
		int actual =  day1.checkNextDate();
		int expected = 1;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase3() throws Exception{
		NextDate day1 = new NextDate(2, 4, 2002);
		int actual =  day1.checkNextDate();
		int expected = 2;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase4() throws Exception{
		NextDate day1 = new NextDate(30, 4, 2002);
		int actual =  day1.checkNextDate();
		int expected = 2;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase5() throws Exception{
		NextDate day1 = new NextDate(2, 12, 2002);
		int actual =  day1.checkNextDate();
		int expected = 3;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase6() throws Exception{
		NextDate day1 = new NextDate(31, 12, 2012);
		int actual =  day1.checkNextDate();
		int expected = 3;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase7() throws Exception{
		NextDate day1 = new NextDate(27, 2, 2002);
		int actual =  day1.checkNextDate();
		int expected = 4;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase8() throws Exception{
		NextDate day1 = new NextDate(28, 2, 2002);
		int actual =  day1.checkNextDate();
		int expected = 4;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase9() throws Exception{
		NextDate day1 = new NextDate(28, 2, 2001);
		int actual =  day1.checkNextDate();
		int expected = 4;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase10() throws Exception{
		NextDate day1 = new NextDate(29, 2, 2000);
		int actual =  day1.checkNextDate();
		int expected = 4;
		Assert.assertEquals(expected,actual);
		
	}

	

}