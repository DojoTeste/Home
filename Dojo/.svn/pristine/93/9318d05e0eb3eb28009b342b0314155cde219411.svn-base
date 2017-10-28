package main;

public class Pessoa {
	public String nome;
	private int idade;
	private char sexo;
	protected String cpf;
	private boolean gostaSorvete;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int idade,char sexo, boolean gostaSorvete) {
		//this.idade = idade;
		setIdade(idade);
		setSexo(sexo);
		setGostaSorvete(gostaSorvete);
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isGostaSorvete() {
		return gostaSorvete;
	}
	public void setGostaSorvete(boolean gostaSorvete) {
		this.gostaSorvete = gostaSorvete;
	}
	
	private boolean isGuloso() {
		return isGostaSorvete();
	}
	
	
	public String toString() {
		
		//cond?x:y;
		String retorno = "Nome: ["+nome+
				"], idade: ["+idade+
				"], sexo ["+sexo+
				"], é guloso? ["+(isGuloso()?"sim":"não")+"]";
		return retorno ;
		
	}
}
