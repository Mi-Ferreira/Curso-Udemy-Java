package Modulo6;

import java.util.Scanner;

public class ExercicioDoisFor {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */
		Scanner sc = new Scanner(System.in);
		int quantidadeDeNumerosInteirosParaVerificarIntervalo = 0;
		int numeroInteiro = 0;
		int dentroDoIntervalo = 0;
		int foraDoIntervalo = 0;
		
		System.out.println("Por favor digite a quantidade de números inteiros, "
				+ "\nque deseja verificar se está no intervalo de [10,20]");
		quantidadeDeNumerosInteirosParaVerificarIntervalo = sc.nextInt();
		
		for (int i = 0; i < quantidadeDeNumerosInteirosParaVerificarIntervalo; i++) {
			System.out.printf("Insira %d° número\n",i+1);
			numeroInteiro = sc.nextInt();
			if ((numeroInteiro>=10) && (numeroInteiro<=20)) {
				dentroDoIntervalo = dentroDoIntervalo + 1;
			}
			else {
				foraDoIntervalo = foraDoIntervalo + 1;
			}
			
		}
		
		System.out.printf("Tiveram %d números dentro do intervalo\n", dentroDoIntervalo);
		System.out.printf("Tiveram %d números fora do intervalo\n", foraDoIntervalo);
		
		sc.close();
	}

}
