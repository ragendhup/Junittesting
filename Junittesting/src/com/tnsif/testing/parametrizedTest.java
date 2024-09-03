package com.tnsif.testing;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class parametrizedTest {
	@ParameterizedTest
	@ValueSource(strings= {"cali","bali","dog"})
	void endswithI(String str) {
		assertTrue(str.endsWith("i"));
	}

}
