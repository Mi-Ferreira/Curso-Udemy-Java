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

		// PE�A 1
		System.out.println("Insira o c�digo do primeiro item");
		codigoDoItem1 = sc.nextInt();

		System.out.println("Quantas pe�as do primeiro item est� sendo comprada?");
		quantidadeCompradaDoItem = sc.nextInt();

		System.out.println("Qual o pre�o unit�rio do primeiro item??");
		valorUnitarioDoItem = sc.nextDouble();

		totalDoItemUm = (double) quantidadeCompradaDoItem * valorUnitarioDoItem;

		// PE�A 2
		System.out.println("Insira o c�digo do segundo item");
		codigoDoItem2 = sc.nextInt();

		System.out.println("Quantas pe�as do segundo item est� sendo comprada?");
		quantidadeCompradaDoItem = sc.nextInt();

		System.out.println("Qual o pre�o unit�rio do segundo item??");
		valorUnitarioDoItem = sc.nextDouble();

		totalDoItemDois = (double) quantidadeCompradaDoItem * valorUnitarioDoItem;

		// VALOR TOTAL
		totalDaCompra = totalDoItemUm + totalDoItemDois;
		System.out.printf("NOTA\nC�DIGO DO ITEM 1:%d VALOR TOTAL DO ITEM 1:%.2f\n" + 
		                   "C�DIGO DO ITEM 1:%d VALOR TOTAL DO ITEM 2:%.2f\n" + 
		                   "VALOR TOTAL A PAGAR:%.2f",
				            codigoDoItem1, totalDoItemUm,codigoDoItem2, totalDoItemDois, totalDaCompra);

		sc.close();
	}
}
