package exercicio4;


public class Main {
	public static void main(String[] args) {
	
		MeuVetor vetor1 = new MeuVetor(5);
		
		System.out.println(vetor1.numElementos());
		
		vetor1.adicionar(0, 1);
		vetor1.adicionar(1, 2);
		vetor1.adicionar(2, 3);
		vetor1.adicionar(3, 4);
		vetor1.adicionar(4, 5);	
		vetor1.imprimir();
		
		vetor1.alterar(0, 10);		
		vetor1.imprimir();
		
		System.out.println(vetor1.getValor(2));
		
		System.out.println(vetor1.maior());
		
		System.out.println(vetor1.menor());
		
		System.out.println(vetor1.somatorio());
		
		vetor1.imprimirImpares();
		
		vetor1.imprimirPares();
		
		System.out.println(vetor1.pertence(5));
		
		System.out.println(vetor1.pertence(11));
		
		MeuVetor vetor2 = new MeuVetor(5);
		
		vetor2.adicionar(0, 1);
		vetor2.adicionar(1, 2);
		vetor2.adicionar(2, 3);
		vetor2.adicionar(3, 4);
		vetor2.adicionar(4, 5);	
		vetor2.imprimir();
		
		System.out.println(vetor1.igual(vetor2));
		
		vetor2.alterar(0, 10);
		
		System.out.println(vetor1.igual(vetor2));
		
		vetor1.intersecao(vetor2);
		
		MeuVetor vetor3 = new MeuVetor(10);
		
		for (int i = 0; i < vetor3.numElementos(); i++) {
			vetor3.adicionar(i, i*2);	
		}
		vetor3.imprimir();
		
		vetor1.intersecao(vetor3);
		
	}

}

//SAIDA ESPERADA
//5
//1 2 3 4 5 
//10 2 3 4 5 
//3
//10
//2
//24
//Impares: 3 5 
//Pares: 10 2 4 
//true
//false
//1 2 3 4 5 
//false
//true
//10 2 3 4 5 
//0 2 4 6 8 10 12 14 16 18 
//10 2 4 


