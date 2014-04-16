package br.com.leonardowolter.validation;

public class Validator {

	public static <T> Validation<T> validate(T t) {
		return new Success<T>(t);
	}

}
