package br.com.leonardowolter.optional;
import static java.util.Optional.empty;

import java.util.Optional;


public class Usuario {
	public Optional<Telefone> telefone = empty();

	public Usuario() {
	}
	
	public Usuario(Integer numero) {
		this.telefone = Optional.of(new Telefone(numero));
	}
	
	public Optional<Telefone> getTelefone() {
		return telefone;
	}
}