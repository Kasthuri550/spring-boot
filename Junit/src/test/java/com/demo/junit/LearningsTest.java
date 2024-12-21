package com.demo.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LearningsTest {
	
	@Test
	@Tag("dev")
	public void testDev()
	{
		System.out.println("Dev");
	}
	
	@Test
	@Tag("prod")
	public void testProd()
	{
		System.out.println("Prod");
	}
	
	@Test
	@Tag("QA")
	public void testQA()
	{
		System.out.println("QA");
	}

}
