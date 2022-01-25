package Modulo5;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.*/
	    /*Renda 			   |	     Imposto de Renda
			 de R$ 0.00 R$ 2000.00     |              Isento               
			 de R$ 2000.01 R$ 3000.00  |                8%         
			 de R$ 3000.01 R$ 4500.00  |                18%
			 acima de R$ 4500.00       |                28% */
		/*Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		duas casas decimais.*/
		
		
		Scanner sc = new Scanner(System.in);
		double valorDoSalario = 0;
		double imposto = 0;
		double excedenteDaFaixa2 = 0;
		double excedenteDaFaixa3 = 0;
		double excedenteDaFaixa4 = 0;
		
		System.out.println("Por favor insira valor do salário");
		valorDoSalario = sc.nextDouble();
		
		if (valorDoSalario >= 0 && valorDoSalario <= 2000.00) {
			System.out.print("Imposto isento");
		}
		else if(valorDoSalario > 2000.00 && valorDoSalario <= 3000.00) {
			excedenteDaFaixa2 = (valorDoSalario - 2000.00) * 0.08;
			imposto = excedenteDaFaixa2;
			System.out.printf("O imposto é %.2f", imposto);
		}
	
		else if(valorDoSalario > 3000.00 && valorDoSalario <= 4500.00) {
			excedenteDaFaixa2 = 999.99 * 0.08;
			excedenteDaFaixa3 = (valorDoSalario - 3000.00) * 0.18;
			imposto = excedenteDaFaixa2 + excedenteDaFaixa3;
			System.out.printf("O imposto é %.2f", imposto);
		}
		else {
			excedenteDaFaixa2 -= 999.99 * 0.08;
			excedenteDaFaixa3 = 1499.99 * 0.18;
			excedenteDaFaixa4 = (valorDoSalario - 4500.00) * 0.28;
			imposto = excedenteDaFaixa2 + excedenteDaFaixa3 + excedenteDaFaixa4;
			System.out.printf("O imposto é %.2f", imposto);
		}
		
		sc.close();
		
		

	}

}
