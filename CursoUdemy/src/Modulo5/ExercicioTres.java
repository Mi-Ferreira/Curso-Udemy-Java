package Modulo5;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;

		System.out.println("Insira o primeiro número");
		primeiroNumero = sc.nextInt();

		System.out.println("Insira o segundo número");
		segundoNumero = sc.nextInt();

		if (primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0) {
			System.out.print("São múltiplos");
		} else {
			System.out.print("Não são múltiplos");
		}

		sc.close();
	}
}
