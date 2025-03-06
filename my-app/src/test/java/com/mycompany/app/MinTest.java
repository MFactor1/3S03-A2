package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.ArrayList;
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
	public void IntegerTest(int val1, int val2, int val3, int ans) {
		List<Integer> testList = new ArrayList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(Min.min(testList), ans);
	}

	private static Stream<Arguments> CharTestArgs() {
		return Stream.of(
			Arguments.of('b','a','c','a'), // Test base lower case
			Arguments.of('b','a','C','C'), // Test lower + upper case
			Arguments.of('a','a','a','a'), // Test all same
			Arguments.of('2','1','3','1') // Test integers as chars
		);
	}

    @ParameterizedTest
	@MethodSource("CharTestArgs")
	public void CharTest(char val1, char val2, char val3, char ans) {
		List<Character> testList = new ArrayList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(Min.min(testList), ans);
	}

	private static Stream<Arguments> StringTestArgs() {
		return Stream.of(
			Arguments.of("b","a","c","a"), // Test base case
			Arguments.of("ab","aa","ac","aa"), // Test multi-character
			Arguments.of("aB","aa","ac","aB"), // Test multi-character with upper case
			Arguments.of("aaa","aa","a","a"), // Test string length-based min
			Arguments.of("2","1","3","1"), // Test integers as strings
			Arguments.of("-1","-2","-3","-1") // Test special characters as negative integers
											  // (note: -1 is min here since ascii(-) + ascii(1) < ascii(-) + ascii(3))
		);
	}

    @ParameterizedTest
	@MethodSource("StringTestArgs")
	public void StringTest(String val1, String val2, String val3, String ans) {
		List<String> testList = new ArrayList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(Min.min(testList), ans);
	}

	@Test
	public void SingleIntTest() { // Test a single integer
		List<Integer> testList = new ArrayList<>();
		testList.add(2);
		assertEquals(Min.min(testList), 2);
	}

	@Test
	public void SingleCharTest() { // Test a single char
		List<Character> testList = new ArrayList<>();
		testList.add('b');
		assertEquals(Min.min(testList), 'b');
	}

	@Test
	public void SingleStringTest() { // Test a single string
		List<String> testList = new ArrayList<>();
		testList.add("test");
		assertEquals(Min.min(testList), "test");
	}

}
