package exercicio5;

import java.util.ArrayList;

public class CatalogoLivros {

	ArrayList<Livro> livros = new ArrayList<Livro>();

	public int getQuantidadeLivros() {
		int tamanho = livros.size();
		return tamanho;
	}

	public void adicionar(Livro novoLivro) {
		livros.add(livros.size(), novoLivro);
//		System.out.println("\nLivro adicionado com sucesso!\n");
	}

	public void remover(int posicao) {
		
		livros.remove(posicao);
		System.out.println("------------------------------------");
//		System.out.println("\nLivro removido com sucesso!\n");
	}

	public void imprimirLivros() {

		System.out.println("-------- Listagem de Livros --------\n");
	
		if(getQuantidadeLivros() == 0) {
			System.out.println("Não há livros cadastrados!\n");	
			System.out.println("------------------------------------");
			
		} else {
		
			for (int i = 0; i < getQuantidadeLivros(); i++) {
				System.out.println("Posicao " + i);
				imprimirDadosLivro(i);
			}
		}
	}

	public void imprimirDadosLivro(int i) {
		
		System.out.println("Codigo: " + livros.get(i).codigo);
		System.out.println("Titulo: " + livros.get(i).titulo);
		System.out.println("Autor: " + livros.get(i).autor);
		System.out.println("Resumo: " + livros.get(i).resumo);
		System.out.println("Numero de paginas: " + livros.get(i).paginas);
		System.out.println("\n");

	}
}
