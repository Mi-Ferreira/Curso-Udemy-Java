package Modulo6;

import java.util.Scanner;

public class ExercicioSeteFor {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
		 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		int numeroInteiro = 0;
		double raizQuadradaDoNumeroInteiro = 0;
		double raizCubicaDoNumeroInteiro = 0;

		System.out.println("Por favor digite um número inteiro " 
		                   + "para calcularmos o quadrado e o cubo\n");
		numeroInteiro = sc.nextInt();

		for (int i = 0; i < numeroInteiro; i++) {
			raizQuadradaDoNumeroInteiro = (i+1) * (i+1);
			raizCubicaDoNumeroInteiro = (i+1) * (i+1) * (i+1);

			System.out.printf("%d %.0f %.0f\n", (i + 1), 
			raizQuadradaDoNumeroInteiro, raizCubicaDoNumeroInteiro);
		}

	}

}
