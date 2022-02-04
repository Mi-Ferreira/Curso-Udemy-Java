package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter with number of lines");
		int m = sc.nextInt();

		System.out.println("Please enter with number of columns");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		System.out.println("Please enter values of matriz");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Please enter with number that you to want found");
		int num = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == num) {
					System.out.println("\nPosition: " + i + "," + j);
					if (j > 0) {
						System.out.println("Left:" + mat[i][j - 1]);
					}
					if (j < n - 1) {
						System.out.println("Right:" + mat[i][j + 1]);
					}

					if (i > 0) {
						System.out.println("Up:" + mat[i - 1][j]);
					}

					if (i < m - 1) {
						System.out.println("Down:" + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}
}
