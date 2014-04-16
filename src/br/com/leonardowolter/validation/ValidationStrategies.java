package br.com.leonardowolter.validation;


import java.util.ArrayList;
import java.util.List;

public class ValidationStrategies{
	
	static final String EMAIL_MESSAGE = "Valor precisa ser um email";
	static final String NOT_EMPTY_MESSAGE = "Valor nao pode ser string vazia";

	public static List<String> notEmpty(String value) {
		List<String> list = emptyList();
		if(value.isEmpty()) list.add(NOT_EMPTY_MESSAGE);
		return list;
	}
	
	public static List<String> email(String value) {
		List<String> list = emptyList();
		if(!value.contains("@")) list.add(EMAIL_MESSAGE);
		return list;
	}
	
	public static List<String> emptyList(){
		return new ArrayList<String>();
	}

}
