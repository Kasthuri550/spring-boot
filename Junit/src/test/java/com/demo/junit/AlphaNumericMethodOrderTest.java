package com.demo.junit;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@SuppressWarnings("deprecation")
@TestMethodOrder(Alphanumeric.class)
public class AlphaNumericMethodOrderTest {
	
	@Test
	public void test13()
	{
		System.out.println("Test13");
	}
	
	@Test
	public void test31()
	{
		System.out.println("Test31");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3");
	}

}
