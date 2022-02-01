package Modulo6;

import java.util.Scanner;

public class ExercicioTresFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */

		Scanner sc = new Scanner(System.in);
		int quantidadeDeTestes = 0;
		double primeiroTermo = 0;
		double segundoTermo = 0;
		double terceiroTermo = 0;
		double mediaPonderada = 0;

		System.out.println("Por favor digite a quantidade de vezes que deseja fazer a média ponderada de 3 números\n");
		quantidadeDeTestes = sc.nextInt();

		for (int i = 0; i < quantidadeDeTestes; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Insira o %d° número do conjunto\n", j + 1);
				double valorAdicionado = sc.nextDouble();
				if (j == 0) {
					primeiroTermo = 2 * valorAdicionado;
				} else if (j == 1) {
					segundoTermo = 3 * valorAdicionado;
				} else {
					terceiroTermo = 5 * valorAdicionado;
				}

			}

			mediaPonderada = (primeiroTermo + segundoTermo + terceiroTermo) / 10;
			System.out.printf("A média ponderada é %.1f\n",mediaPonderada);
		}

		sc.close();
	}

}
