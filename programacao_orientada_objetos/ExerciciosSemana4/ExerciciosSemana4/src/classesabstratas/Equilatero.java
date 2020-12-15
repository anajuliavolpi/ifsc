package classesabstratas;

public class Equilatero extends FiguraGeometrica {

	double lado;
	
	public Equilatero(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {

		double area = Math.sqrt(3)/4 * Math.pow(lado, 2);
		return area;
	}

	@Override
	public double calcularPerimetro() {
		
		double perimetro = lado *3;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Triangulo Equilatero\n" + "Lado1 = " + lado + "\n"+ "Lado2 = " + lado + "\n"+ "Lado3 = " + lado;

	}

}
