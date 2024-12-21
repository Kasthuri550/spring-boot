package com.demo.junit;

/*
 * @Test
 * @BeforeEach
 * @AfterEach
 * @BeforeAll
 * @AfterAll
 * @RepeatedTest
 * @DisplayName
 * @Disabled
 * @Tag
 * @TestMethodOrder
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Practing Test")
public class PracticeTest {

	@BeforeAll
	public static void start()
	{
		System.out.println("Begin....");
	}

	@BeforeEach
	public void setUp()
	{
		System.out.println("Setup");
	}

	@AfterEach
	public void cleanUp()
	{
		System.out.println("Cleanup");
	}

	@AfterAll
	public static void end()
	{
		System.out.println("End....");
	}

	@Test
	@DisplayName("Testing Read Method")
	public void testRead()
	{
		System.out.println("Read");
	}

	@Test
	@DisplayName("Testing Write Method")
	public void testWrite()
	{
		System.out.println("Write");
	}

	@Test
	@DisplayName("Testing Speak Method")
	@Disabled("I don't like to speak")
	public void testSpeak()
	{
		System.out.println("Speak");
	}

}
