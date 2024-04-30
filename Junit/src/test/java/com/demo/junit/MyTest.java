package com.demo.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyCustomParameterResolver.class)
public class MyTest {
	
	@Test
	@DisplayName(value = "MyCustomType Object")
	void testWithCustomParameter(MyCustomType myCustomType)
	{
		myCustomType.setName("Kasthuri");
		myCustomType.setAge(25);
		
		assertEquals("Kasthuri",myCustomType.getName());	
	}
	
	@Test
	void testWithCustomParameterAge(MyCustomType myCustomType)
	{
		
		assertNull(myCustomType.getName());
		assertEquals(0,myCustomType.getAge());
	}
}
