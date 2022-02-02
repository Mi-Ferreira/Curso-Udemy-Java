package Dollar;

import java.util.Scanner;

public class applicationDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("What is the dollar price?");
		double quantityDollar = sc.nextDouble();
		
		double result = dollar.dollarConversion(dollarPrice, quantityDollar);
		System.out.printf("Amount to be paid in reais is %.2f",result);
		
		sc.close();
	}

}
