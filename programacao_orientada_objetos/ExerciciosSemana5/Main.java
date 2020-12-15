
public class Main {
	
	public static void main(String[] args) {
		NumerosPrimos numeros = new NumerosPrimos(5);

		String vetor[] = { "1", "-1", "a", "g", "2", "5", "10", "s", "q", "7", "11","23","20","5","5" };

		for (String v : vetor) {
			try {
				numeros.addNumero(Integer.parseInt(v));
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		numeros.print();

	}


}
//SAIDA ESPERADA
//exercicio.NumeroPrimoException: Valor nao eh primo
//exercicio.NumeroNegativoException: Valor negativo
//java.lang.NumberFormatException: For input string: "a"
//java.lang.NumberFormatException: For input string: "g"
//exercicio.NumeroPrimoException: Valor nao eh primo
//java.lang.NumberFormatException: For input string: "s"
//java.lang.NumberFormatException: For input string: "q"
//exercicio.NumeroPrimoException: Valor nao eh primo
//java.lang.ArrayIndexOutOfBoundsException: Array cheio
//java.lang.ArrayIndexOutOfBoundsException: Array cheio
//2 5 7 11 23 
