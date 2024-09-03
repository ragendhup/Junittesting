package com.tnsif.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class AssumDemo {
	@Test
	
	public void testAssumption() {
		
		int a=5 ,s=25;
		Assumptions.assumeTrue(s==a*a);
		System.out.println("will it be displayed");
	}
@Test
public void test() {
	int a=9,b=9;
	Assumptions.assumingThat(a!=b, ()-> System.out.println("will it be displayed"));
}
}
