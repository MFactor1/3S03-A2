package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.stream.Stream;

public class MinTest {

	private static Stream<Arguments> IntegerTestArgs() {
		return Stream.of(
			Arguments.of(2,1,3,1), // Test positive normal case
			Arguments.of(-1,-2,-3,-3), // Test negative normal case
			Arguments.of(-1,0,1,-1), // Test pos/neg boundary
			Arguments.of(Integer.MAX_VALUE, 99999, 12345, 12345), // Test max int boundary
			Arguments.of(Integer.MIN_VALUE, 0, -12345, Integer.MIN_VALUE), // Test min int boundary
			Arguments.of(1,1,1,1), // Test positive all same
			Arguments.of(-1,-1,-1,-1), // Test negative all same
			Arguments.of(0,0,0,0) // Test zero all same
		);
	}

    @ParameterizedTest
	@MethodSource("IntegerTestArgs")
	public void ArrayListIntegerTest(int val1, int val2, int val3, int expected) { // Execute Integer tests using an ArrayList
		List<Integer> testList = new ArrayList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

    @ParameterizedTest
	@MethodSource("IntegerTestArgs")
	public void LinkedListIntegerTest(int val1, int val2, int val3, int expected) { // Execute Integer tests using a LinkedList
		List<Integer> testList = new LinkedList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

    @ParameterizedTest
	@MethodSource("IntegerTestArgs")
	public void VectorIntegerTest(int val1, int val2, int val3, int expected) { // Execute Integer tests using a Vector
		List<Integer> testList = new Vector<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

	private static Stream<Arguments> DoubleTestArgs() {
		return Stream.of(
			Arguments.of(1.29, 3.68, 0.11, 0.11), // Test positive normal case
			Arguments.of(-1.29, -3.68, -0.11, -3.68), // Test negative normal case
			Arguments.of(-Double.MIN_VALUE, 0, Double.MIN_VALUE, -Double.MIN_VALUE), // Test pos/neg boundary
			Arguments.of(Double.MAX_VALUE, 99999.9, 12345.5, 12345.5), // Test max double boundary
			Arguments.of(-Double.MAX_VALUE, 0.0, -12345.5, -Double.MAX_VALUE), // Test min double boundary
			Arguments.of(1.1,1.1,1.1,1.1), // Test positive all same
			Arguments.of(-1.1,-1.1,-1.1,-1.1), // Test negative all same
			Arguments.of(0.0,0.0,0.0,0.0) // Test zero all same
		);
	}

    @ParameterizedTest
	@MethodSource("DoubleTestArgs")
	public void ArrayListDoubleTest(double val1, double val2, double val3, double expected) { // Execute Double tests using an ArrayList
		List<Double> testList = new ArrayList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

    @ParameterizedTest
	@MethodSource("DoubleTestArgs")
	public void LinkedListDoubleTest(double val1, double val2, double val3, double expected) { // Execute Double tests using a LinkedList
		List<Double> testList = new LinkedList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

    @ParameterizedTest
	@MethodSource("DoubleTestArgs")
	public void VectorDoubleTest(double val1, double val2, double val3, double expected) { // Execute Double tests using a Vector
		List<Double> testList = new Vector<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

	private static Stream<Arguments> CharTestArgs() {
		return Stream.of(
			Arguments.of('b','a','c','a'), // Test base lower case
			Arguments.of('b','a','C','C'), // Test lower + upper case
			Arguments.of('a','a','a','a'), // Test all same
			Arguments.of('2','1','a','1'), // Test integers as chars
			Arguments.of(' ', '&', '/', ' ') // Test special characters
		);
	}

    @ParameterizedTest
	@MethodSource("CharTestArgs")
	public void CharTest(char val1, char val2, char val3, char expected) { // Execute Char tests using an ArrayList
		List<Character> testList = new ArrayList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

    @ParameterizedTest
	@MethodSource("CharTestArgs")
	public void LinkedListCharTest(char val1, char val2, char val3, char expected) { // Execute Char tests using a LinkedList
		List<Character> testList = new LinkedList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

    @ParameterizedTest
	@MethodSource("CharTestArgs")
	public void VectorCharTest(char val1, char val2, char val3, char expected) { // Execute Char tests using a Vector
		List<Character> testList = new Vector<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

	private static Stream<Arguments> StringTestArgs() {
		return Stream.of(
			Arguments.of("b","a","c","a"), // Test base case
			Arguments.of("ab","aa","ac","aa"), // Test multi-character
			Arguments.of("aB","aa","ac","aB"), // Test multi-character with upper case
			Arguments.of("aa","a","",""), // Test string length-based min
			Arguments.of("aaa","aa","a","a"), // Test string length-based min
			Arguments.of("2","1","a","1") // Test integers as strings
		);
	}

    @ParameterizedTest
	@MethodSource("StringTestArgs")
	public void ArrayListStringTest(String val1, String val2, String val3, String expected) { // Execute String tests using an ArrayList
		List<String> testList = new ArrayList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

    @ParameterizedTest
	@MethodSource("StringTestArgs")
	public void LinkedListStringTest(String val1, String val2, String val3, String expected) { // Execute String tests using a LinkedList
		List<String> testList = new LinkedList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

    @ParameterizedTest
	@MethodSource("StringTestArgs")
	public void VectorStringTest(String val1, String val2, String val3, String expected) { // Execute String tests using a Vector
		List<String> testList = new Vector<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(expected, Min.min(testList));
	}

	@Test
	public void ListLenOneTest() { // Test an ArrayList list of length one
		List<Integer> testList = new ArrayList<>();
		testList.add(2);
		assertEquals(2, Min.min(testList));
	}

	@Test
	public void LinkedListTest() { // Test a LinkedList of length one
		List<Integer> testList = new LinkedList<>();
		testList.add(2);
		assertEquals(2, Min.min(testList));
	}

	@Test
	public void VectorTest() { // Test a Vector of length one
		List<Integer> testList = new Vector<>();
		testList.add(2);
		assertEquals(2, Min.min(testList));
	}
}
