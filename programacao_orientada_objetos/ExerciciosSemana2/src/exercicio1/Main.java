package exercicio1;

//Descricao dos metodos em aula.pdf
public class Main {

	public static void main(String[] args) {

		Ponto ponto,ponto1,ponto2,ponto3,ponto4;

		NumeroComplexo numero1, numero2, numero3, numero4, numero5 ;
		
		ponto = new Ponto();
		ponto.setX(-9);
		ponto.setY(12);

		ponto1 = new Ponto(1,1);
		ponto2 = new Ponto(1,4);
		ponto3 = new Ponto(3,3);
		ponto4 = new Ponto(2,2);
	
		numero1 = new NumeroComplexo();
		numero1.setReal(5);
		numero1.setImaginario(8);

		numero2 = new NumeroComplexo(1,2);
		numero3 = new NumeroComplexo(6, 10);
		numero4 = new NumeroComplexo(4, 6);
		numero5 = new NumeroComplexo(-11, 18);
		
		if(ponto.norma() == 15) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	
		
		if (ponto1.distancia(ponto2) == 3) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

		if (Ponto.distancia(ponto1, ponto2) == 3) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}
		
		if(Calculadora.igual(1,1)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}
		
		if(Calculadora.igual(ponto1,ponto1)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	
		
		if(Calculadora.igual(numero1,numero1)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}			
		
		if(Calculadora.igual(Calculadora.somar(1, 2), 3)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}
		
		if(Calculadora.igual(Calculadora.somar(ponto1, ponto4), ponto3)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

		if(Calculadora.igual(Calculadora.somar(numero1, numero2), numero3)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		
		
		if(Calculadora.igual(Calculadora.subtrair(3, 1), 2)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}		
	
		if(Calculadora.igual(Calculadora.subtrair(ponto3, ponto1), ponto4)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	
		
		if(Calculadora.igual(Calculadora.subtrair(numero1, numero2), numero4)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	
		
		if(Calculadora.igual(Calculadora.multiplicar(3, 1), 3)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}
		
		if(Calculadora.igual(Calculadora.multiplicar(3, ponto1), ponto3)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}

		if(Calculadora.igual(Calculadora.multiplicar(ponto1, ponto1), 2)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}	

		if(Calculadora.igual(Calculadora.multiplicar(numero1, numero2), numero5)) {
			System.out.println("OK");
		}else {
			System.out.println("ERRO");
		}
		
	}
	
}
//SAIDA ESPERADA
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
