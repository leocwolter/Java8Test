package br.com.leonardowolter.validation;

import java.util.List;
import java.util.function.Consumer;

public interface Validation<T> {

	public Validation<T> shouldBe(ValidationStrategy<T> vs);

	public List<String> getErrors();

	void forEachError(Consumer<String> consumer);

	public void ifHasError(Consumer<String> object);
}
