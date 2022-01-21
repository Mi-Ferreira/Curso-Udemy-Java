package Modulo5;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int codigoDoProduto = 0;
		int quantidadeDoProduto = 0;
		double totalAPagar = 0;
		String valorInvalido;

		System.out.println("Olá insira o código do item conforme o cardápio abaixo:\n" + "1 Cachorro Quente R$ 4,00\n"
				+ "2 X - Salada R$ 4,50\n" + "3 x - Bacon R$ 5,00\n" + "4 Torrada Simples R$ 2,00\n"
				+ "5 Refrigerante R$ 1,50\n");
		codigoDoProduto = sc.nextInt();

		System.out.println("Olá insira a quantidade do item");
		quantidadeDoProduto = sc.nextInt();

		switch (codigoDoProduto) {
		case 1:
			totalAPagar = quantidadeDoProduto * 4.00;
			break;
		case 2:
			totalAPagar = quantidadeDoProduto * 4.50;
			break;
		case 3:
			totalAPagar = quantidadeDoProduto * 5.00;
			break;
		case 4:
			totalAPagar = quantidadeDoProduto * 2.00;
			break;
		case 5:
			totalAPagar = quantidadeDoProduto * 1.50;
			break;
		default:
			valorInvalido = "O código inserido é inválido";
			break;
		}

		System.out.printf("O total a pagar é de %.2f", totalAPagar);
	}
}
