package main;

public class TestaEstacionamento {

	public static void main(String[] args) {
		
		Estacionamento estacionaMentirinha = new Estacionamento();
		
		Carro c1 = new Carro("Vermelho","ABC1234",180);
		Carro c2 = new Carro("Azul","ABC1235",280);
		Carro c3 = new Carro("Verde","ABC1236",190);
		Carro c4 = new Carro("Amarelo","ABC1237",170);
		Carro c5 = new Carro("Rosa","ABC1238",140);
		Carro c6 = new Carro("Preto","ABC1239",120);
		Carro c7 = new Carro("Branco","ABC1230",300);
		
		estacionaMentirinha.estaciona(c1);
		estacionaMentirinha.estaciona(c2);
		estacionaMentirinha.estaciona(c3);
		System.out.println("Carros estacionados: \n" +estacionaMentirinha.mostraCarros());
		estacionaMentirinha.estaciona(c4);
		estacionaMentirinha.estaciona(c5);
		estacionaMentirinha.estaciona(c6);
		estacionaMentirinha.estaciona(c7);
		System.out.println("Carros estacionados: \n" +estacionaMentirinha.mostraCarros());
		
		estacionaMentirinha.sai(c7);
		estacionaMentirinha.sai(c3);

	}

}
