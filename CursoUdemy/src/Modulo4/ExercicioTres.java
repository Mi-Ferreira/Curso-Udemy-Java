package Modulo4;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		System.out.println("Digite o primeiro n�mero");
		a = sc.nextInt();

		System.out.println("Digite o segundo n�mero");
		b = sc.nextInt();

		System.out.println("Digite o terceiro n�mero");
		c = sc.nextInt();

		System.out.println("Digite o quarto10 n�mero");
		d = sc.nextInt();

		int diferencaDoProduto = (a * b) - (c * d);
		System.out.printf("A diferen�a do produto de a com b e c com d � %d", diferencaDoProduto);
		
		sc.close();
	}

}
