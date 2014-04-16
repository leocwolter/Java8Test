package br.com.leonardowolter.optional;
import java.util.Optional;


public class OptionalTest {

	public static void main(String[] args) {
		Usuario leo = new Usuario();
		
		Telefone orElse = Optional.of(leo)
				.flatMap(Usuario::getTelefone)
				.orElse(new Telefone(123));
		
		System.out.println(orElse);
				
		Usuario rafael = new Usuario(321);
		
		Telefone withValue = Optional.of(rafael)
				.flatMap(Usuario::getTelefone)
				.orElse(new Telefone(123));
		
		System.out.println(withValue);
		
	}
}
