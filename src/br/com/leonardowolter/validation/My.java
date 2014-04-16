package br.com.leonardowolter.validation;

public class My {

	public static <T> Validation<T> value(T t) {
		return new Success<T>(t);
	}

}
