package main;

import java.util.ArrayList;

public class Estacionamento {
	
	private ArrayList<Carro>lista = new ArrayList();
	
	public void estaciona(Carro car) {
		getLista().add(car);
	}
	
	public void sai(Carro car) {
		getLista().remove(car);
		System.out.println("Carros que saiu: " +car.getPlaca()+" | "+car.getCor()+" | "+car.getVelocidadeMaxima()+"Km/h"+"\n");
	}

	public ArrayList<Carro> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Carro> lista) {
		this.lista = lista;
	}
	
	public String mostraCarros() {
		String retorno = "";
			for (Carro c : lista) {
				retorno += c.getPlaca()+" | "+c.getCor()+" | "+c.getVelocidadeMaxima()+"Km/h"+"\n";
			}
		return retorno;
	}
	
	public void estacionaTudo(Carro...lista) {
		for (Carro carro : lista) {
			estaciona(carro);
		}
		
	}
	
	public void estacionaTudo2(Carro[] lista) {
		for (Carro carro : lista) {
			estaciona(carro);
		}
	}
}
