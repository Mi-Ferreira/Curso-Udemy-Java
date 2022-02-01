package Triangulo;

public class rectangle {

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
