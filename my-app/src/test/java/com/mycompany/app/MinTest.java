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
			Arguments.of(2,1,3,1),
			Arguments.of(-1,-2,-3,-3),
			Arguments.of(-1,0,1,-1),
			Arguments.of(1,1,1,1),
			Arguments.of(-1,-1,-1,-1),
			Arguments.of(0,0,0,0)
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
			Arguments.of('b','a','c','a'),
			Arguments.of('b','a','C','C'),
			Arguments.of('a','a','a','a'),
			Arguments.of('2','1','3','1')
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
			Arguments.of("ab","aa","ac","aa"),
			Arguments.of("aB","aa","ac","aB"),
			Arguments.of("aaa","aa","a","a"),
			Arguments.of("2","1","3","1"),
			Arguments.of("-1","-2","-3","-1"),
			Arguments.of("-1","0","1","-1")
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
	public void SingleIntTest() {
		List<Integer> testList = new ArrayList<>();
		testList.add(2);
		assertEquals(Min.min(testList), 2);
	}

	@Test
	public void SingleCharTest() {
		List<Character> testList = new ArrayList<>();
		testList.add('b');
		assertEquals(Min.min(testList), 'b');
	}

	@Test
	public void SingleStringTest() {
		List<String> testList = new ArrayList<>();
		testList.add("test");
		assertEquals(Min.min(testList), "test");
	}

}
