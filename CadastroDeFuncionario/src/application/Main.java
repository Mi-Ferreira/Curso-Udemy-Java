package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean findIdEmployee = true;
		List <Employee> listEmployee = new ArrayList <>();
		
		System.out.println("How many employees will be registered?");
		Integer quantityRegister = sc.nextInt();
		
		for(int i = 0; i < quantityRegister; i++) {
			System.out.println("Please enter id");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Please enter name");
			String name = sc.nextLine();
			
			System.out.println("Please enter salary");
			Double salary = sc.nextDouble();
			
			listEmployee.add(new Employee(id, name, salary));
		}
		
		for(Employee employee : listEmployee) {
			System.out.println(employee);
		}
				
		System.out.println("Enter the employee id that will have salary increase:");
		int idEnter = sc.nextInt();
		for(Employee employee : listEmployee) {				
			if(idEnter == employee.getId()) {
				System.out.println("Enter the percentage:");
				employee.increaseSalary(sc.nextDouble());
				
				findIdEmployee = false;
			}
			
		}
		if (findIdEmployee){
			System.out.println("This id does not exist!");
		}
		
		for(Employee employee : listEmployee) {
			System.out.println(employee);
		}
		
		sc.close();		
	}

}
