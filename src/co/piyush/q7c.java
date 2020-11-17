package co.piyush;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

@DisplayName("Pass enum values to our test method")
public class q7c {
	@DisplayName("Should pass only the specified enum value as a method parameter")
    @ParameterizedTest(name = "{index} => pet=''{0}''")
    @EnumSource(value = Pet.class, names = {"CAT"})
    void shouldPassNonNullEnumValueAsMethodParameter(Pet pet) {
        assertNotNull(pet);
    }
}
