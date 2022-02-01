package Modulo4;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeroDoFuncionario = 0;
		double numeroDeHorasTrabalhadas = 0;
		double valorDaHoraDoFuncionario = 0;
		double salarioDoFuncionario = 0;

		System.out.println("Digite o número do funcionário");
		numeroDoFuncionario = sc.nextInt();

		System.out.println("Digite o número de horas trabalhadas");
		numeroDeHorasTrabalhadas = sc.nextDouble();

		System.out.println("Digite o valor que o funcionário recebe por hora");
		valorDaHoraDoFuncionario = sc.nextDouble();

		salarioDoFuncionario = numeroDeHorasTrabalhadas * valorDaHoraDoFuncionario;
		System.out.printf("O salário total do funcionário número %d é de %.2f", numeroDoFuncionario, salarioDoFuncionario);

		sc.close();
	}

}
