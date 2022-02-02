package Employee;

public class employee {
	/*
	 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
	 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
	 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
	 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
	 * mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
	 */

	String name;
	double grossSalary;
	double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage, double grossSalary) {
		this.grossSalary += grossSalary * percentage / 100;
	}
	
	public String toString() {
		return "Nome: " + name + "\n" + "Net Salary:" + String.format("%.2f", netSalary());
	}
}
