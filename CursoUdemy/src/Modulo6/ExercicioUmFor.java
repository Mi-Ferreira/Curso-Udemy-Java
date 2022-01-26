package Modulo6;

import java.util.Scanner;

public class ExercicioUmFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso
		 */

		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.println("Por favor insira um número inteiro de 1 a 1000");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		System.out.print(num);

	}

}
