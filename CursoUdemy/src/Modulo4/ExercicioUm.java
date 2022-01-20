package Modulo4;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando");

		Scanner sc = new Scanner(System.in);

		int numeroUm = 0;
		int numeroDois = 0;
		int soma = 0;

		System.out.println("Digite o primeiro número");
		numeroUm = sc.nextInt();

		System.out.println("Digite o segundo número");
		numeroDois = sc.nextInt();
		
		soma = numeroUm + numeroDois;
		
		System.out.printf("O numero %d somado com %d resulta em %d", numeroUm, numeroDois, soma);

		sc.close();

	}

}
