package com.redhat.juggernaut;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals(String.format("hey there %s", "michael"), helloWorld.sayHello("michael"));
	}

}
