package Modulo5;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”*/
		
		Scanner sc = new Scanner(System.in);
		double numeroInserido = 0;

		System.out.println("Por favor insira um número");
		numeroInserido = sc.nextDouble();

		if (numeroInserido >= 0 && numeroInserido <= 25) {
			System.out.print("O número está no intervalo de [0,25]");
		} else if (numeroInserido > 25 && numeroInserido <= 50) {
			System.out.print("O número está no intervalo de (25,50]");
		} else if (numeroInserido > 50 && numeroInserido <= 75) {
			System.out.print("O número está no intervalo de (50,75]");
		} else if (numeroInserido > 75 && numeroInserido <= 100) {
			System.out.print("O número está no intervalo de (75,100]");
		} else {
			System.out.print("Fora do Intervalo");
		}

		sc.close();
	}

}
