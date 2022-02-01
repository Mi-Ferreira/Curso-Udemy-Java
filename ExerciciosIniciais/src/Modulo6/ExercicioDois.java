package Modulo6;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma)
		 */
		Scanner sc = new Scanner(System.in);
		double valorX = 0;
		double valorY = 0;

		System.out.println("Por favor insira valor de X");
		valorX = sc.nextDouble();

		System.out.println("Por favor insira o valor de Y");
		valorY = sc.nextDouble();

		while ((valorX != 0) && (valorY != 0)) {
			if (valorX > 0 && valorY > 0) {
				System.out.println("O número está no Quadrante 1");
				mostraPerguntaDasCoordenadasXeY();
			} else if (valorX < 0 && valorY > 0) {
				System.out.println("O número está no Quadrante 2");
				mostraPerguntaDasCoordenadasXeY();
			} else if (valorX < 0 && valorY < 0) {
				System.out.print("O número está no Quadrante 3");
				mostraPerguntaDasCoordenadasXeY();
			} else if (valorX > 0 && valorY < 0) {
				System.out.print("O número está no Quadrante 4");
				mostraPerguntaDasCoordenadasXeY();
			}
		}

	}

	public static void mostraPerguntaDasCoordenadasXeY() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor insira valor de X");
		double valorX = sc.nextDouble();

		System.out.println("Por favor insira o valor de Y");
		double valorY = sc.nextDouble();
	}

}
