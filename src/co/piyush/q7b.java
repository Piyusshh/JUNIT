package co.piyush;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

@DisplayName("Pass enum values to our test method")
public class q7b {
	@DisplayName("Should pass non-null enum values as method parameters")
    @ParameterizedTest(name = "{index} => pet=''{0}''")
    @EnumSource(Pet.class)
    void shouldPassNonNullEnumValuesAsMethodParameter(Pet pet) {
        assertNotNull(pet);
    }
}
