package br.com.leonardowolter.validation;

import static br.com.leonardowolter.validation.ValidationStrategies.EMAIL_MESSAGE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class ValidationTests {

	@Test
	public void should_fail_second_condition() {
		boolean containsEmailError = My.value("string")
				.shouldBe(ValidationStrategies::notEmpty)
				.shouldBe(ValidationStrategies::email)
				.getErrors()
				.contains(EMAIL_MESSAGE);
		
		assertTrue(containsEmailError);
	}
	
	@Test
	public void should_fail_first_and_second_condition() {
		int numberOfErrors = My.value("")
				.shouldBe(ValidationStrategies::notEmpty)
				.shouldBe(ValidationStrategies::email)
				.getErrors()
				.size();
		
		assertEquals(2, numberOfErrors);
	}
	
	@Test
	public void should_not_fail() {
		My.value("leo@leo.com")
				.shouldBe(ValidationStrategies::notEmpty)
				.shouldBe(ValidationStrategies::email)
				.ifHasError(Assert::fail);
	}

}
