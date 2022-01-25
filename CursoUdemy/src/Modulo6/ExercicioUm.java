package Modulo6;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		Scanner sc = new Scanner(System.in);
		int senha = 0;

		System.out.println("Por favor insira a senha");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Inválida");
			System.out.println("Por favor insira a senha");
			senha = sc.nextInt();
		}

		System.out.print("Acesso permitido");
	}
}
