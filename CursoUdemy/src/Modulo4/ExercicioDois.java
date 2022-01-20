package Modulo4;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio = 0;

		System.out.println("Vamos calcular a área de um círculo");

		System.out.println("Insira o valor do raio do círculo");
		raio = sc.nextDouble();

		Double raioAoQuadrado = Math.pow(raio, 2);
		Double areaDoCirculo = pi * raioAoQuadrado;

		System.out.printf("A área do círculo é %.4f", areaDoCirculo);
	}
}
