package exercicios;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio, altura, vol;
		
		System.out.println("Digite a altura:");
		altura = in.nextDouble();
		
		System.out.println("Digite o raio:");
		raio = in.nextDouble();
		
		if(raio > 0 && altura >0) {
			vol = Math.PI * Math.pow(raio, 2) * altura;
			System.out.println(String.format("%.3f", vol));
		}
		else {
			System.out.println("Valores invalidos");
		}
	}

}
