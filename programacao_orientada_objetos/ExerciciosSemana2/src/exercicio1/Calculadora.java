package exercicio1;

public class Calculadora {

	public static boolean igual(Ponto ponto1, Ponto ponto2) {

		if(ponto1.x == ponto2.x && ponto1.y == ponto2.y) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean igual(int i, int j) {

		if(i == j) {
			return true;
		} else {
			return false;
		}
	}

	public static int somar(int i, int j) {
		
		int soma = i + j;
		return soma;
	}

	public static boolean igual(NumeroComplexo numero1, NumeroComplexo numero2) {

		if(numero1.real == numero2.real && numero1.imaginario == numero2.imaginario) {
			return true;
		} else {
			return false;
		}
	}

	public static Ponto somar(Ponto ponto1, Ponto ponto2) {

		Ponto ponto = new Ponto();
		int x = ponto1.x + ponto2.x;
		int y = ponto1.y + ponto2.y;
		ponto.setX(x);
		ponto.setY(y);
		return ponto;
	}

	public static NumeroComplexo somar(NumeroComplexo numero1, NumeroComplexo numero2) {
		
		NumeroComplexo numeroComplexo = new NumeroComplexo();
		int real = numero1.real + numero2.real;
		int imaginario = numero1.imaginario + numero2.imaginario;
		numeroComplexo.setReal(real);
		numeroComplexo.setImaginario(imaginario);
		return numeroComplexo;
	}

	public static int multiplicar(Ponto ponto1, Ponto ponto2) {

//		Ponto ponto = new Ponto();		
		int x = ponto1.x * ponto2.x;
		int y = ponto1.y * ponto2.y;
		int mult = x + y;
//		ponto.setX(x);
//		ponto.setY(y);
		return mult;
	}

	public static NumeroComplexo multiplicar(NumeroComplexo numero1, NumeroComplexo numero2) {
	
		NumeroComplexo numeroComplexo = new NumeroComplexo();
		int real = numero1.real * numero2.real;
		int imaginario = numero1.imaginario * numero2.imaginario;
		numeroComplexo.setReal(real);
		numeroComplexo.setImaginario(imaginario);
		return numeroComplexo;		
	}

	public static Ponto multiplicar(int i, Ponto ponto1) {

		Ponto ponto = new Ponto();
		int x = ponto1.x * i;
		int y = ponto1.y * i;
		ponto.setX(x);
		ponto.setY(y);
		return ponto;
	}

	public static int multiplicar(int i, int j) {

		int mult = i*j;
		return mult;
	}

	public static int subtrair(int i, int j) {

		int sub = i - j;
		return sub;
	}

	public static Ponto subtrair(Ponto ponto1, Ponto ponto2) {

		Ponto ponto = new Ponto();
		int x = ponto1.x - ponto2.x;
		int y = ponto1.y - ponto2.y;
		ponto.setX(x);
		ponto.setY(y);
		return ponto;
	}

	public static NumeroComplexo subtrair(NumeroComplexo numero1, NumeroComplexo numero2) {

		NumeroComplexo numeroComplexo = new NumeroComplexo();
		int real = numero1.real - numero2.real;
		int imaginario = numero1.imaginario - numero2.imaginario;
		numeroComplexo.setReal(real);
		numeroComplexo.setImaginario(imaginario);
		return numeroComplexo;
	}

}
