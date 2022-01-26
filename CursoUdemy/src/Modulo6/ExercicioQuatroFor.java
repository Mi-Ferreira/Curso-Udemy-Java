package Modulo6;

import java.util.Scanner;

public class ExercicioQuatroFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */

		Scanner sc = new Scanner(System.in);
		int quantidadeDeVezesDividindoDoisNumeros = 0;
		double primeiroTermo = 0;
		double segundoTermo = 0;
		double divisao = 0;

		System.out.println("Por favor digite a quantidade de vezes que\n" + "deseja fazer a divisão de dois números\n");
		quantidadeDeVezesDividindoDoisNumeros = sc.nextInt();

		for (int i = 0; i < quantidadeDeVezesDividindoDoisNumeros; i++) {

			System.out.println("Insira o numerador da divisão\n");
			primeiroTermo = sc.nextDouble();

			System.out.println("Insira o denominador da divisão\n");
			segundoTermo = sc.nextDouble();

			if (segundoTermo == 0) {
				System.out.println("Divisão impossível");
			}

			else {
				divisao = primeiroTermo / segundoTermo;
				System.out.printf("A divisão é  %.1f\n", divisao);
			}

		}

		sc.close();
	}

}
