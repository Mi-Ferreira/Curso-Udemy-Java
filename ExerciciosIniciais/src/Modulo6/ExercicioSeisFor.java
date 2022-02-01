package Modulo6;

import java.util.Scanner;

public class ExercicioSeisFor {

	public static void main(String[] args) {
		/*Ler um número inteiro N e calcular todos os seus divisores.*/
		
		Scanner sc = new Scanner(System.in);
		int numeroParaCalcularDivisores = 0;
	
		System.out.println("Por favor digite um número para "
				+ "calcularmos seus divisores\n");
		numeroParaCalcularDivisores = sc.nextInt();

		for (int i = 0; i < numeroParaCalcularDivisores; i++) {
			if (numeroParaCalcularDivisores % (i+1) == 0) {
				System.out.println(i+1);
			}
			
		}

	}

}
