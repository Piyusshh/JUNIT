package co.piyush;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

public class q7f {
	@ParameterizedTest
	@NullSource
	void isBlank_ShouldReturnTrueForNullInputs(String input) {
	    assertTrue(Strings.isBlank(input));
	}
	
	@ParameterizedTest
	@EmptySource
	void isBlank_ShouldReturnTrueForEmptyStrings(String input) {
	    assertTrue(Strings.isBlank(input));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	void isBlank_ShouldReturnTrueForNullAndEmptyStrings(String input) {
	    assertTrue(Strings.isBlank(input));
	}
}
