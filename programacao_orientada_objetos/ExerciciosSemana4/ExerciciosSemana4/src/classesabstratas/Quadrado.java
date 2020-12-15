package classesabstratas;

public class Quadrado extends FiguraGeometrica {

	double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {		
		double area = lado * lado;
		return area;		
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Quadrado\n" + "Lado = " + lado;
	}
	
}
