package com.staragile;

import org.junit.Test;

import junit.framework.Assert;

	public class CalculatorTest {

		@Test
		public void testSum() {
			// Given
			Calculator2 calculator = new Calculator2();
			// When
			int result = calculator.sum(2, 2);
			// Then
			Assert.assertEquals(4, result); // if 2 + 2 != 4, this will fail
		}

		@Test
		public void testMinus() {
			Calculator2 calculator = new Calculator2();
			Assert.assertEquals(0, calculator.minus(2, 2));
		}

		@Test
		public void testDivide() {
			Calculator2 calculator = new Calculator2();
			Assert.assertEquals(2, calculator.divide(6, 3));
		}

		@Test(expected = ArithmeticException.class)
		public void testDivideWillThrowExceptionWhenDivideOnZero() {
			Calculator2 calculator = new Calculator2();
			calculator.divide(6, 0);
		}
	}




