package Modulo5;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;

		System.out.println("Por favor insira um número");
		numero1 = sc.nextInt();

		if (numero1 % 2 == 0) {
			System.out.print("O número é par");
		} else {
			System.out.println("O número é impar");
		}

		sc.close();
	}

}
