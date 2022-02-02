package Employee;

public class employee {
	/*
	 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e
	 * imposto). Em seguida, mostrar os dados do funcion�rio (nome e sal�rio
	 * l�quido). Em seguida, aumentar o sal�rio do funcion�rio com base em uma
	 * porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) e
	 * mostrar novamente os dados do funcion�rio. Use a classe projetada abaixo.
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
