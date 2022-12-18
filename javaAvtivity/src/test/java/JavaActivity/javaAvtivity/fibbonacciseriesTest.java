package JavaActivity.javaAvtivity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class fibbonacciseriesTest {
	
	static FibbonacciSeries fs;
	 @BeforeAll
	public static void setup()
	{
		fs = new FibbonacciSeries();
	}
	 @Test
		public void testWithNegative()
		{
		 assertEquals(0, fs.fibbonacciSeries(-1),"fibbonacci series of -1 is 0");
		}
	 
	 @Test
	public void testWithZero()
	{
//		int expected = 0;
//		int actual = 0;
		assertEquals(0,fs.fibbonacciSeries(0),"fibbonacci series of 0 is 0");
	}
	 @Test
	 public void testWithOne()
	 { 
		 assertEquals(1,fs.fibbonacciSeries(1),"fibbonacci series for number 1 is 1");
	 }
//	 public void calculateAt2()
//	 {
//		 assertEquals(3,fs.fibbonacciSeries());
//	 }
	 @Test
	 public void testWithTwo()
	 {
		 assertEquals(1,fs.fibbonacciSeries(2),"fibbonacci series for number 2 is 1");
	 }
	 @Test
	 public void testWithSix()
	 {
		 assertEquals(5,fs.fibbonacciSeries(5),"fibbonacci series for number 6 is 8");
	 }
	 @AfterAll
	 public static void cleanUp()
	 {
		 System.out.println("Cleaning up our programs");
	 }
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
