package Rectangle;

public class rectangle {
	/*
	 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
	 * seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma
	 * classe como mostrado no projeto ao lado.
	 */

	double width;
	double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * width + 2 * height;
	}

	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}

	public String toString() {
		return "Area:" + String.format("%.2f", area()) + "Perimeter:" + String.format("%.2f", perimeter()) + "Diagonal:"
				+ String.format("%.2f", diagonal());
	}
}
