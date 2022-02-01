package Triangulo;

import java.util.Scanner;

public class applicationRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		rectangle rectangleOne = new rectangle();

		System.out.print("Please, insert height");
		rectangleOne.height = sc.nextDouble();

		System.out.print("Please, insert height");
		rectangleOne.width = sc.nextDouble();

		System.out.println(rectangleOne);

		sc.close();
	}

}
