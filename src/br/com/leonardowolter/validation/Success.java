package br.com.leonardowolter.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Success<T> implements Validation<T>{
	private T value;

	public Success(T value) {
		this.value = value;
	}

	@Override
	public Validation<T> with(ValidationStrategy<T> vs) {
		List<String> errors = vs.validate(value);
		if(errors.isEmpty()){
			return new Success<T>(value);
		}
		return new Fail<T>(value, errors);
			
	}

	@Override
	public List<String> getErrors() {
		return new ArrayList<String>();
	}

	@Override
	public void forEachError(Consumer<String> consumer) {
	}

	@Override
	public void ifHasError(Consumer<String> object) {
	}



}
