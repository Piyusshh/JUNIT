package co.piyush;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class q7g {
	@ParameterizedTest
	@MethodSource("provideStringsForIsBlank")
	void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
	    assertEquals(expected, Strings.isBlank(input));
	}
}
