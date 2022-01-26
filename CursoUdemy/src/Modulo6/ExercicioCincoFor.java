package Modulo6;

import java.util.Scanner;

public class ExercicioCincoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeroParaCalcularFatorial = 0;
		int fatorial = 1;

		System.out.println("Por favor digite um número para calcularmos o fatorial\n");
		numeroParaCalcularFatorial = sc.nextInt();

		for (int i = 0; i < numeroParaCalcularFatorial; i++) {
			if (numeroParaCalcularFatorial == 0) {
				fatorial = 1;
				System.out.print(fatorial);
			}
			fatorial = (i + 1) * fatorial;
			
		}
		
		System.out.print(fatorial);

	}

}
