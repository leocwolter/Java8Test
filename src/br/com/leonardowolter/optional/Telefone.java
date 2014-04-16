package br.com.leonardowolter.optional;
import java.util.Optional;

class Telefone{
	private Optional<Integer> ddd;
	private Integer numero;
	
	public Telefone(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numero=" + numero + "]";
	}
	
	
}
