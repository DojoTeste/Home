package main;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionario>lista = new ArrayList();
	
	public void contrata (Funcionario func) {
		getLista().add(func);
	}
	
	public void demite (Funcionario func) {
		getLista().remove(func);
	}

	public ArrayList<Funcionario> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Funcionario> lista) {
		this.lista = lista;
	}
	
	public String mostraFuncionarios() {
		String retorno = "";
			for (Funcionario f : lista) {
				retorno += f.getNome()+"\n";
			}
		return retorno;
	}
	
	

}

