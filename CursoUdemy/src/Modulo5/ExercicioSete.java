package Modulo5;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
		 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 * situação.
		 */

		Scanner sc = new Scanner(System.in);
		double valorDeX = 0;
		double valorDeY = 0;

		System.out.println("Por favor insira valor de X");
		valorDeX = sc.nextDouble();

		System.out.println("Por favor insira o valor de Y");
		valorDeY = sc.nextDouble();

		if (valorDeX > 0 && valorDeY > 0) {
			System.out.print("O número está no Quadrante 1");
		} else if (valorDeX < 0 && valorDeY > 0) {
			System.out.print("O número está no Quadrante 2");
		} else if (valorDeX < 0 && valorDeY < 0) {
			System.out.print("O número está no Quadrante 3");
		} else if (valorDeX > 0 && valorDeY < 0) {
			System.out.print("O número está no Quadrante 4");
		} else {
			if (valorDeX == 0 && valorDeY != 0) {
				System.out.print("Está sobre o eixo Y");
			} else if (valorDeX != 0 && valorDeY == 0) {
				System.out.print("Está sobre o eixo X");
			} else {
				System.out.print("Origem");
			}

		}

		sc.close();

	}

}
