package Modulo4;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		System.out.println("Digite o primeiro número");
		a = sc.nextInt();

		System.out.println("Digite o segundo número");
		b = sc.nextInt();

		System.out.println("Digite o terceiro número");
		c = sc.nextInt();

		System.out.println("Digite o quarto10 número");
		d = sc.nextInt();

		int diferencaDoProduto = (a * b) - (c * d);
		System.out.printf("A diferença do produto de a com b e c com d é %d", diferencaDoProduto);
		
		sc.close();
	}

}
