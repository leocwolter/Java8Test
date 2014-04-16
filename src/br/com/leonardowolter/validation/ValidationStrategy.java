package br.com.leonardowolter.validation;

import java.util.List;

public interface ValidationStrategy<T> {
	List<String> validate(T value);
}
