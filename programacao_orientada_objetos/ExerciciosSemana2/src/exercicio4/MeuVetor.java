package exercicio4;

public class MeuVetor {

	int tamanho;
	int vetor[] = null;
	
	
	public MeuVetor(int tamanho) {

		this.tamanho = tamanho;

	}

	public int numElementos() {

		return tamanho;
	}

	public void adicionar(int posicao, int valor) {
		vetor[posicao] = valor;
	}

	public void alterar(int posicao, int valor) {
		vetor[posicao] = valor;
	}

	public void imprimir() {

		for(int i = 0; i < tamanho; i++) {
			
			System.out.print(vetor[i]+" ");			
		}
		
	}

	public char[] getValor(int i) {

		return null;
	}

	public char[] maior() {

		return null;
	}

	public char[] menor() {

		return null;
	}

	public char[] somatorio() {

		return null;
	}

	public void imprimirImpares() {


	}

	public void imprimirPares() {


	}

	public char[] pertence(int i) {

		return null;
	}

	public char[] igual(MeuVetor vetor2) {

		return null;
	}

	public void intersecao(MeuVetor vetor2) {


	}

}
