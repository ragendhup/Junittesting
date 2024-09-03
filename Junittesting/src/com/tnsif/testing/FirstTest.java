package com.tnsif.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
//@Test not allowed
public class FirstTest {
	//@Disabled()
	@DisplayName("my test 1")
    @Test
	void display() {
		System.out.println("my test method");
	}
	@RepeatedTest(4)
	@DisplayName("my test 2")
    @Test
void Hello() {
	System.out.println("greet");
}
}
