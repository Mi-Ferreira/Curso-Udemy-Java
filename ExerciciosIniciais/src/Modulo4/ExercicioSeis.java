package Modulo4;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double pontoA = 0;
		double pontoB = 0;
		double pontoC = 0;
		double pi = 3.14159;

		System.out.println("Vamos calcular a �rea de figuras geom�ticas!!\nInsira tres pontos");
		pontoA = sc.nextDouble();
		pontoB = sc.nextDouble();
		pontoC = sc.nextDouble();

		double areaTrianguloRetangulo = (pontoA * pontoC) / 2;
		double areaCirculo = pi * pontoC * pontoC;
		double areaTrapezio = ((pontoA + pontoB) / 2) * pontoC;
		double areaQuadrado = pontoB * pontoB;
		double areaRetangulo = pontoA * pontoB;

		System.out.printf(
				"Area do Triangulo Ret�ngulo:%.3f\n" + "Area do C�rculo %.3f\n" + "Area do Trap�zio:%.3f\n"
						+ "Area do Quadrado:%.3f\n" + "Area do Ret�ngulo:%.3f",
				areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

		sc.close();
	}

}
