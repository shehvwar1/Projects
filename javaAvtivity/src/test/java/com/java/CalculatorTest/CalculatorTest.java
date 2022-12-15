package com.java.CalculatorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import JavaActivity.javaAvtivity.Calculator;

class CalculatorTest {
	static Calculator cs;
	
	@BeforeAll
	static void setUp()
	{
		cs = new Calculator();
	}
	@Test
	void testAddition()
	{
		assertEquals(5,cs.addition(3,2),"Addition of 3 & 2 is 5" );
	}
	@Test
	void testSubtraction()
	{
		assertEquals(7,cs.subtraction(15,8),"Subtraction of 15 & 8 is 7" );
	}
	@Test
	void testMultiply()
	{
		assertEquals(35,cs.multiply(7,5),"Multiplication of 7 & 5 is 35" );
	}
	@Test
	void testDivideWithException()
	{
		assertEquals(2,cs.divide(3,0),"Division of 3 & 0 will throw exception" );
	}
	@Test
	void testDivide()
	{
		assertEquals(2,cs.divide(4,2),"Division of 4 & 2 is 2" );
	}


//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
