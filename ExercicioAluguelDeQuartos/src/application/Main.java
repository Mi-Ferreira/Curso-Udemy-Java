package application;

import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] room = new Student[10];
		int quantityRoom = 0;

		System.out.println("Please, enter quantity of rooms (1 - 10)");
		quantityRoom = sc.nextInt();
		
		
		for (int i = 1; i<= quantityRoom; i++) {
			System.out.println("Please enter name");
			String name = sc.nextLine();
			
			sc.nextLine();
			
			System.out.println("Please enter e-mail");
			String email = sc.nextLine();
			
			System.out.println("Please enter with"
		            + " identification number of room (0 - 9");
			int numberOfRoom = sc.nextInt();
			
			room [numberOfRoom] = new Student(name, email, numberOfRoom);
			
		}
		
		for (int i = 0; i< room.length; i++) {
			if (room[i] != null) {
				System.out.println(room[i].getRoom() + ":" +   
						"Name: " + room[i].getName() + 
						"E-mail: " + room[i].getE_mail());
			}
		}
		
		sc.close();
	}

	
	
}
