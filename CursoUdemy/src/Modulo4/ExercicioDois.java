package Modulo4;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio = 0;

		System.out.println("Vamos calcular a �rea de um c�rculo");

		System.out.println("Insira o valor do raio do c�rculo");
		raio = sc.nextDouble();

		Double raioAoQuadrado = Math.pow(raio, 2);
		Double areaDoCirculo = pi * raioAoQuadrado;

		System.out.printf("A �rea do c�rculo � %.4f", areaDoCirculo);
	}
}
