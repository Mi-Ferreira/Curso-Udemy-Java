package Modulo6;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a
		 * prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa
		 * ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combust�vel, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		int codigoCombustivel = 0;
		int quantidadeDeUsuarioQuePreferemAlcool = 0;
		int quantidadeDeUsuarioQuePreferemGasolina = 0;
		int quantidadeDeUsuarioQuePreferemDiesel = 0;

		System.out.println("Por favor insira apenas numero de 1 a 4.\n" + " Sendo:\n" + "1.�lcool\n" + "2.Gasolina \n"
				+ "3.Diesel\n" + "4.Fim.");
		codigoCombustivel = sc.nextInt();

		while (codigoCombustivel != 4) {
			switch (codigoCombustivel) {
			case 1:
				quantidadeDeUsuarioQuePreferemAlcool += 1;
				System.out.println("Por favor insira apenas numero de 1 a 4.\n" + 
						" Sendo:\n" 
								+ "1.�lcool\n"
								+ "2.Gasolina \n" 
								+ "3.Diesel\n" 
								+ "4.Fim.");
						codigoCombustivel = sc.nextInt();
				break;
			case 2:
				quantidadeDeUsuarioQuePreferemGasolina += 1;
				System.out.println("Por favor insira apenas numero de 1 a 4.\n" + 
						" Sendo:\n" 
								+ "1.�lcool\n"
								+ "2.Gasolina \n" 
								+ "3.Diesel\n" 
								+ "4.Fim.");
						codigoCombustivel = sc.nextInt();
				break;
			case 3:
				quantidadeDeUsuarioQuePreferemDiesel += 1;
				System.out.println("Por favor insira apenas numero de 1 a 4.\n" + 
						" Sendo:\n" 
								+ "1.�lcool\n"
								+ "2.Gasolina \n" 
								+ "3.Diesel\n" 
								+ "4.Fim.");
						codigoCombustivel = sc.nextInt();
				break;
			default:
				System.out.println("C�digo inv�lido");
				System.out.println("Por favor insira apenas numero de 1 a 4.\n" + 
				" Sendo:\n" 
						+ "1.�lcool\n"
						+ "2.Gasolina \n" 
						+ "3.Diesel\n" 
						+ "4.Fim.");
				codigoCombustivel = sc.nextInt();
				break;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("A quantidade que preferem �lcool � %d\n",quantidadeDeUsuarioQuePreferemAlcool);
		System.out.printf("A quantidade que preferem gasolina � %d\n", quantidadeDeUsuarioQuePreferemGasolina);
		System.out.printf("A quantidade que preferem diesel � %d ", quantidadeDeUsuarioQuePreferemDiesel);
		
		sc.close();
	}

}
