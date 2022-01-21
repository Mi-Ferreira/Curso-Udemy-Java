package Modulo4;

import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigoDoItem1 = 0;
		int codigoDoItem2 = 0;
		int quantidadeCompradaDoItem = 0;
		double valorUnitarioDoItem = 0;
		double totalDoItemUm = 0;
		double totalDoItemDois = 0;
		double totalDaCompra = 0;

		// PEÇA 1
		System.out.println("Insira o código do primeiro item");
		codigoDoItem1 = sc.nextInt();

		System.out.println("Quantas peças do primeiro item está sendo comprada?");
		quantidadeCompradaDoItem = sc.nextInt();

		System.out.println("Qual o preço unitário do primeiro item??");
		valorUnitarioDoItem = sc.nextDouble();

		totalDoItemUm = (double) quantidadeCompradaDoItem * valorUnitarioDoItem;

		// PEÇA 2
		System.out.println("Insira o código do segundo item");
		codigoDoItem2 = sc.nextInt();

		System.out.println("Quantas peças do segundo item está sendo comprada?");
		quantidadeCompradaDoItem = sc.nextInt();

		System.out.println("Qual o preço unitário do segundo item??");
		valorUnitarioDoItem = sc.nextDouble();

		totalDoItemDois = (double) quantidadeCompradaDoItem * valorUnitarioDoItem;

		// VALOR TOTAL
		totalDaCompra = totalDoItemUm + totalDoItemDois;
		System.out.printf("NOTA\nCÓDIGO DO ITEM 1:%d VALOR TOTAL DO ITEM 1:%.2f\n" + 
		                   "CÓDIGO DO ITEM 1:%d VALOR TOTAL DO ITEM 2:%.2f\n" + 
		                   "VALOR TOTAL A PAGAR:%.2f",
				            codigoDoItem1, totalDoItemUm,codigoDoItem2, totalDoItemDois, totalDaCompra);

		sc.close();
	}
}
