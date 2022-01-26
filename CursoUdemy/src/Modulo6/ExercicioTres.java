package Modulo6;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		int codigoCombustivel = 0;
		int quantidadeDeUsuarioQuePreferemAlcool = 0;
		int quantidadeDeUsuarioQuePreferemGasolina = 0;
		int quantidadeDeUsuarioQuePreferemDiesel = 0;

		System.out.println("Por favor insira apenas numero de 1 a 4.\n" + " Sendo:\n" + "1.Álcool\n" + "2.Gasolina \n"
				+ "3.Diesel\n" + "4.Fim.");
		codigoCombustivel = sc.nextInt();

		while (codigoCombustivel != 4) {
			switch (codigoCombustivel) {
			case 1:
				quantidadeDeUsuarioQuePreferemAlcool += 1;
				System.out.println("Por favor insira apenas numero de 1 a 4.\n" + 
						" Sendo:\n" 
								+ "1.Álcool\n"
								+ "2.Gasolina \n" 
								+ "3.Diesel\n" 
								+ "4.Fim.");
						codigoCombustivel = sc.nextInt();
				break;
			case 2:
				quantidadeDeUsuarioQuePreferemGasolina += 1;
				System.out.println("Por favor insira apenas numero de 1 a 4.\n" + 
						" Sendo:\n" 
								+ "1.Álcool\n"
								+ "2.Gasolina \n" 
								+ "3.Diesel\n" 
								+ "4.Fim.");
						codigoCombustivel = sc.nextInt();
				break;
			case 3:
				quantidadeDeUsuarioQuePreferemDiesel += 1;
				System.out.println("Por favor insira apenas numero de 1 a 4.\n" + 
						" Sendo:\n" 
								+ "1.Álcool\n"
								+ "2.Gasolina \n" 
								+ "3.Diesel\n" 
								+ "4.Fim.");
						codigoCombustivel = sc.nextInt();
				break;
			default:
				System.out.println("Código inválido");
				System.out.println("Por favor insira apenas numero de 1 a 4.\n" + 
				" Sendo:\n" 
						+ "1.Álcool\n"
						+ "2.Gasolina \n" 
						+ "3.Diesel\n" 
						+ "4.Fim.");
				codigoCombustivel = sc.nextInt();
				break;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("A quantidade que preferem álcool é %d\n",quantidadeDeUsuarioQuePreferemAlcool);
		System.out.printf("A quantidade que preferem gasolina é %d\n", quantidadeDeUsuarioQuePreferemGasolina);
		System.out.printf("A quantidade que preferem diesel é %d ", quantidadeDeUsuarioQuePreferemDiesel);
		
		sc.close();
	}

}
