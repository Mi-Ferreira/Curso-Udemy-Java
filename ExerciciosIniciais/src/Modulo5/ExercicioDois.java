package Modulo5;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;

		System.out.println("Por favor insira um n�mero");
		numero1 = sc.nextInt();

		if (numero1 % 2 == 0) {
			System.out.print("O n�mero � par");
		} else {
			System.out.println("O n�mero � impar");
		}

		sc.close();
	}

}
