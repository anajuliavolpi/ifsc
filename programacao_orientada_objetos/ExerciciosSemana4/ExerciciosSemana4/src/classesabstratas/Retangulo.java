package classesabstratas;

public class Retangulo extends FiguraGeometrica {

	int base, altura;
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;

	}

	@Override
	public double calcularArea() {
		
		double area = base * altura;
		return area;	

	}
	@Override
	public double calcularPerimetro() {
		double perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

	@Override
	public String toString() {
		return "Retangulo\n" + "Base = " + base + "\n"+ "Altura = " + altura;
	}
	

	
	
}
