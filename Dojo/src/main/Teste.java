package main;
import util.Utils;

public class Teste {

	public static void main(String[] args) {
		Utils utils = new Utils();
		
		Pessoa pessoa = new Pessoa(29, 'M', false);
		
		pessoa.nome = "Paspalh�o";
		pessoa.cpf = "12345678909";
		System.out.println(pessoa.getIdade());
		pessoa.setIdade(15);
		System.out.println(pessoa.getIdade());
		
		System.out.println(pessoa.toString());
	}

}
