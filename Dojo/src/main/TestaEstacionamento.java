package main;

import java.util.ArrayList;

import org.apache.commons.lang3.ArrayUtils;

public class TestaEstacionamento {

	public static void main(String[] args) {
		
		Estacionamento estacionaMentirinha = new Estacionamento();
		
		Carro c1 = new Carro("Vermelho","ABC1234",180,50,true,"alcool");
		Carro c2 = new Carro("Azul","ABC1235",280,90,false,"diesel");
		Carro c3 = new Carro("Verde","ABC1236",190,1540);
		Carro c4 = new Carro("Amarelo","ABC1237",170,22,false,"etanol");
		Carro c5 = new Carro("Rosa","ABC1238",140,0);
		Carro c6 = new Carro("Preto","ABC1239",120,50,true,"alcool");
		Carro c7 = new Carro("Branco","ABC1230",300,50,true,"gas");
		
//		estacionaMentirinha.estacionaTudo2(ArrayUtils.toArray(c1,c2,c3,c4,c5,c6,c7));
		
//		estacionaMentirinha.estaciona(c1);
//		estacionaMentirinha.estaciona(c2);
//		estacionaMentirinha.estaciona(c3);
		System.out.println("Carros estacionados: \n" +estacionaMentirinha.mostraCarros());
//		estacionaMentirinha.estaciona(c4);
//		estacionaMentirinha.estaciona(c5);
//		estacionaMentirinha.estaciona(c6);
//		estacionaMentirinha.estaciona(c7);
		estacionaMentirinha.estacionaTudo(c1,c2,c3,c4,c5,c6,c7);
		System.out.println("Carros estacionados: \n" +estacionaMentirinha.mostraCarros());
		c1.passear(55);
		System.out.println("Tanque de veiculo de placa " +c1.getPlaca()+ " com: " +c1.getTanque()+ "\n");
		
		estacionaMentirinha.sai(c7);
		estacionaMentirinha.sai(c3);

	}

}
