package com.demo.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class MyPracticeTest {

	@RepeatedTest(value = 3,name="{displayName} - {currentRepetition}/{totalRepetitions}")
	@DisplayName("Test Jump")
	public void testYourJump(TestInfo info)
	{
		System.out.println("I can jump "+info.getTestClass().get().getName());
		System.out.println(info.getTestMethod().get().getName());
		System.out.println(info.getDisplayName());
	}

}
