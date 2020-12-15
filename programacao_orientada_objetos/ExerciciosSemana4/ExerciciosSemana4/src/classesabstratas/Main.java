package classesabstratas;


import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
		
		figuras.add( new Quadrado(2));
		figuras.add( new Retangulo(2,3) );
		figuras.add( new Circulo(1));
		figuras.add( new Equilatero(2) );
		figuras.add( new Isosceles(2, 3) );
		figuras.add( new Escaleno(2, 3, 4) );
		
		for (FiguraGeometrica figura : figuras) {
			System.out.println("Tipo = " + figura);
			System.out.println("Área = " + figura.calcularArea());
			System.out.println("Perímetro = " +figura.calcularPerimetro());
		}
		
		
	}

}
//SAIDA ESPERADA
//Tipo = Quadrado
//Lado = 2.0
//Área = 4.0
//Perímetro = 8.0
//Tipo = Retângulo
//Base = 2.0
//Altura = 3.0
//Área = 6.0
//Perímetro = 10.0
//Tipo = Círculo
//Raio = 1.0
//Área = 3.141592653589793
//Perímetro = 6.283185307179586

//Tipo = Triângulo Equilátero
//Lado1 = 2.0
//Lado2 = 2.0
//Lado3 = 2.0
//Área = 1.7320508075688772
//Perímetro = 6.0

//Tipo = Triângulo Isósceles
//Lado1 = 2.0
//Lado2 = 3.0
//Lado3 = 3.0
//Área = 2.8284271247461903
//Perímetro = 8.0
//Tipo = Triângulo Escaleno
//Lado1 = 2.0
//Lado2 = 3.0
//Lado3 = 4.0
//Área = 2.9047375096555625
//Perímetro = 9.0
