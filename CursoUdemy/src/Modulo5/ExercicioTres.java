package Modulo5;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;

		System.out.println("Insira o primeiro n�mero");
		primeiroNumero = sc.nextInt();

		System.out.println("Insira o segundo n�mero");
		segundoNumero = sc.nextInt();

		if (primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0) {
			System.out.print("S�o m�ltiplos");
		} else {
			System.out.print("N�o s�o m�ltiplos");
		}

		sc.close();
	}
}
