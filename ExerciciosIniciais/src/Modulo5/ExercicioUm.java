package Modulo5;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		System.out.println("Por favor insira um n�mero");
		numero = sc.nextInt();
		
		if (numero>=0) {
			System.out.print("O n�mero � positivo");
		}
		else {
			System.out.println("O n�mero � negativo");
		}
		
		sc.close();
	}

}
