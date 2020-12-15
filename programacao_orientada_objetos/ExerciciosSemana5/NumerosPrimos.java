
public class NumerosPrimos {
	int numeros[], pos=0;

	public NumerosPrimos(int n) {
		numeros = new int[n];
	}

	public boolean isPrimo(int numero) {
		
		if(numero == 1) {
			return false;
		}
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;   
			}
		}
		return true;
	}

	public void addNumero(int n) throws NumeroNegativoException, NumeroPrimoException {

		if(n < 0) {
			throw new NumeroNegativoException("Valor negativo");
		} else if (!isPrimo(n)) {
			throw new NumeroPrimoException("Valor nao eh primo");
		} else if (pos >= numeros.length) {
			throw new ArrayIndexOutOfBoundsException("Array cheio");
		} else{
			numeros[pos++] = n;		
		}
	}

	public void print() {
		for (int j = 0; j < numeros.length; j++) {
			System.out.print(numeros[j] +" ");
		}
		System.out.println();
	}

}
