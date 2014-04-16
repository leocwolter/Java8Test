package br.com.leonardowolter.validation;

import static br.com.leonardowolter.validation.ValidationStrategies.EMAIL_MESSAGE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class ValidationTests {

	@Test
	public void should_fail_second_condition() {
		boolean containsEmailError = Validator.validate("string")
				.with(ValidationStrategies::notEmpty)
				.with(ValidationStrategies::email)
				.getErrors()
				.contains(EMAIL_MESSAGE);
		
		assertTrue(containsEmailError);
	}
	
	@Test
	public void should_fail_first_and_second_condition() {
		int numberOfErrors = Validator.validate("")
				.with(ValidationStrategies::notEmpty)
				.with(ValidationStrategies::email)
				.getErrors()
				.size();
		
		assertEquals(2, numberOfErrors);
	}
	
	@Test
	public void should_not_fail() {
		Validator.validate("leo@leo.com")
				.with(ValidationStrategies::notEmpty)
				.with(ValidationStrategies::email)
				.ifHasError(Assert::fail);
	}

}
