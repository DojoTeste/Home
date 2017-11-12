package main;

public class Carro {
	private static final double TAXA = 1.5;
	private String cor;
	private String placa;
	private int velocidadeMaxima;
	private double tanque;
	private boolean flex;
	private String tipoCombustivel;
	
	public Carro(String cor, String placa, int velocidadeMaxima, double tanque, boolean flex, String tipoCombustivel) {
		setCor(cor);
		setPlaca(placa);
		setVelocidadeMaxima(velocidadeMaxima);
		setTanque(tanque);
		setFlex(flex);
		setTipoCombustivel(tipoCombustivel);
	}
	
	public Carro(String cor, String placa, int velocidadeMaxima, double tanque) {
		setCor(cor);
		setPlaca(placa);
		setVelocidadeMaxima(velocidadeMaxima);
		setTanque(tanque);
		setFlex(false);
		setTipoCombustivel("Gasolina");
	}
	
	public void passear(int distancia) {
		for(int i = 0; i < distancia; i++) {
			if(tanque >= TAXA) {
				tanque -= TAXA;
			}else {
				System.out.println("Sem combustivel suficiente.Tanque com: " +tanque+ " lts. \n" + "Distancia percorrida: " +i+ "\n");
				break;
			}
		}
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

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}

	public boolean isFlex() {
		return flex;
	}

	public void setFlex(boolean flex) {
		this.flex = flex;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

}
