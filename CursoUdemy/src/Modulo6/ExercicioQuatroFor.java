package Modulo6;

import java.util.Scanner;

public class ExercicioQuatroFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int quantidadeDeVezesDividindoDoisNumeros = 0;
		double primeiroTermo = 0;
		double segundoTermo = 0;
		double divisao = 0;

		System.out.println("Por favor digite a quantidade de vezes que\n" + "deseja fazer a divis�o de dois n�meros\n");
		quantidadeDeVezesDividindoDoisNumeros = sc.nextInt();

		for (int i = 0; i < quantidadeDeVezesDividindoDoisNumeros; i++) {

			System.out.println("Insira o numerador da divis�o\n");
			primeiroTermo = sc.nextDouble();

			System.out.println("Insira o denominador da divis�o\n");
			segundoTermo = sc.nextDouble();

			if (segundoTermo == 0) {
				System.out.println("Divis�o imposs�vel");
			}

			else {
				divisao = primeiroTermo / segundoTermo;
				System.out.printf("A divis�o �  %.1f\n", divisao);
			}

		}

		sc.close();
	}

}
