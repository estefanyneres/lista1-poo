
public class Triangulo {
	double lado, perimetro, area;

	Triangulo(double lado) {
		this.lado = lado;
	}

	double calcArea() {
		area = lado * Math.sqrt(3)/2;
		return area;
	}
	
	double calcPerimetro() {
		perimetro = 3 * lado;
		return perimetro;
	}
}
