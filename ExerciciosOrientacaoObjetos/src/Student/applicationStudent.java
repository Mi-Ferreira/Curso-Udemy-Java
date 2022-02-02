package Student;

import java.util.Scanner;

import Employee.employee;

public class applicationStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		student student = new student();

		System.out.println("Enter name student");
		student.nameStudent = sc.nextLine();

		System.out.println("Enter first note student");
		student.noteA = sc.nextDouble();

		System.out.println("Enter second note student");
		student.noteB = sc.nextDouble();

		System.out.println("Enter third note student");
		student.noteC = sc.nextDouble();

		System.out.print(student);

		sc.close();
	}

}
