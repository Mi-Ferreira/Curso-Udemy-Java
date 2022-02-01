package Modulo5;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double horaInicial = 0;
		double horaFinal = 0;
		double diferencaDoDia = 0;
		double duracaoDoJogo = 0;

		System.out.println("Por favor a hora inicial do jogo");
		horaInicial = sc.nextDouble();

		System.out.println("Por favor a hora final do jogo");
		horaFinal = sc.nextDouble();

		if (horaInicial > horaFinal) {
			diferencaDoDia = 24 - horaInicial;
			duracaoDoJogo = diferencaDoDia + horaFinal;
		} else if (horaInicial < horaFinal) {
			duracaoDoJogo = horaFinal - horaInicial;
		} else {
			duracaoDoJogo = 24;
		}

		System.out.printf("A duração do jogo foi de %f horas", duracaoDoJogo);

		sc.close();
	}

}
