package br.com.leonardowolter.validation;

import java.util.List;
import java.util.function.Consumer;


public class Fail<T> implements Validation<T> {

	private T value;
	private List<String> errors;
	

	public Fail(T value, List<String> errors) {
		this.value = value;
		this.errors = errors;
	}

	@Override
	public Validation<T> with(ValidationStrategy<T> vs) {
		errors.addAll(vs.validate(value)); 
		return new Fail<T>(value, errors);
	}

	@Override
	public List<String> getErrors() {
		return errors;
	}

	@Override
	public void forEachError(Consumer<String> consumer) {
		errors.forEach(consumer);
	}

	@Override
	public void ifHasError(Consumer<String> consumer) {
		consumer.accept(errors.toString());
	}


}
