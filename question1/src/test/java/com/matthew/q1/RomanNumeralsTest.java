package com.matthew.q1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RomanNumeralsTest
{
	// Required to achieve coverage on the RomanNumerals class definition
	@Test
	public void testInstantiation() {
		RomanNumerals rn = new RomanNumerals();
	}

    @Test
    public void testZero() {
		assertEquals("", RomanNumerals.roman(0));
    }

    @Test
    public void testThree() {
		assertEquals("III", RomanNumerals.roman(3));
    }

    @Test
    public void testFour() {
		assertEquals("IV", RomanNumerals.roman(4));
    }

    @Test
    public void testEight() {
		assertEquals("VIII", RomanNumerals.roman(8));
    }

    @Test
    public void testNine() {
		assertEquals("IX", RomanNumerals.roman(9));
    }

    @Test
    public void testNineNine() {
		assertEquals("XCIX", RomanNumerals.roman(99));
    }

    @Test
    public void testHundred() {
		assertEquals("", RomanNumerals.roman(100));
    }
}
