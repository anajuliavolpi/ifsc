package classesabstratas;

public class Circulo extends FiguraGeometrica {

	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = raio * Math.PI * 2;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Circulo\n" + "Raio = " + raio;

	}

}
