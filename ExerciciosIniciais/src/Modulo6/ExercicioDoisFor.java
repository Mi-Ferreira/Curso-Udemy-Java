package Modulo6;

import java.util.Scanner;

public class ExercicioDoisFor {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X
		 * que ser�o lidos em seguida. Mostre quantos destes valores X est�o dentro do
		 * intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas
		 * informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */
		Scanner sc = new Scanner(System.in);
		int quantidadeDeNumerosInteirosParaVerificarIntervalo = 0;
		int numeroInteiro = 0;
		int dentroDoIntervalo = 0;
		int foraDoIntervalo = 0;
		
		System.out.println("Por favor digite a quantidade de n�meros inteiros, "
				+ "\nque deseja verificar se est� no intervalo de [10,20]");
		quantidadeDeNumerosInteirosParaVerificarIntervalo = sc.nextInt();
		
		for (int i = 0; i < quantidadeDeNumerosInteirosParaVerificarIntervalo; i++) {
			System.out.printf("Insira %d� n�mero\n",i+1);
			numeroInteiro = sc.nextInt();
			if ((numeroInteiro>=10) && (numeroInteiro<=20)) {
				dentroDoIntervalo = dentroDoIntervalo + 1;
			}
			else {
				foraDoIntervalo = foraDoIntervalo + 1;
			}
			
		}
		
		System.out.printf("Tiveram %d n�meros dentro do intervalo\n", dentroDoIntervalo);
		System.out.printf("Tiveram %d n�meros fora do intervalo\n", foraDoIntervalo);
		
		sc.close();
	}

}
