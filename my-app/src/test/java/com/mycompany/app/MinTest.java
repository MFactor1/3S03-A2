package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class MinTest {

	private static Stream<Arguments> StandardTestArgs() {
		return Stream.of(
				Arguments.of(2,1,3,1),
				Arguments.of(-1,-2,-3,-3),
				Arguments.of(-1,0,1,-1),
				Arguments.of(1,1,1,1),
				Arguments.of(-1,-1,-1,-1),
				Arguments.of(0,0,0,0),
				Arguments.of('b','a','c','a'),
				Arguments.of('a','a','a','a'),
				Arguments.of('2','1','3','1'),
				Arguments.of("ab","aa","ac","aa"),
				Arguments.of("aaa","aa","a","a"),
				Arguments.of("2","1","3","1"),
				Arguments.of("-1","-2","-3","-1"),
				Arguments.of("-1","0","1","-1")
		);
	}

    @ParameterizedTest
	@MethodSource("IntegerTestArgs")
	public void StandardTest(int val1, int val2, int val3, int ans) {
		List<Integer> testList = new ArrayList<>();
		testList.add(val1);
		testList.add(val2);
		testList.add(val3);
		assertEquals(Min.min(testList), ans);
	}

	@Test
	public

}
