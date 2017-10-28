package main;

public class Carro {
	private String cor;
	private String placa;
	private int velocidadeMaxima;
	
	public Carro(String cor, String placa, int velocidadeMaxima) {
		setCor(cor);
		setPlaca(placa);
		setVelocidadeMaxima(velocidadeMaxima);
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}
