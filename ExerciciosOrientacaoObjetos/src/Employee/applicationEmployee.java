package Employee;

import java.util.Scanner;

public class applicationEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		employee employee = new employee();

		System.out.println("Enter name employee");
		employee.name = sc.nextLine();

		System.out.println("Enter grossSalary employee");
		employee.grossSalary = sc.nextDouble();

		System.out.println("Enter percentage of increase Gross Salary");
		employee.increaseSalary(sc.nextDouble(), employee.grossSalary);

		System.out.println("Enter tax");
		employee.tax = sc.nextDouble();

		employee.netSalary();

		System.out.println(employee);

		sc.close();
	}

}
