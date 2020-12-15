import java.util.ArrayList;

public class CatalogoLivros {
	
	ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public int getQuantidadeLivros(){		
		int tamanho = livros.size();
		return tamanho;					
	}
	
	public boolean adicionar(Livro novoLivro){        
		livros.add(livros.size(), novoLivro);
		System.out.println("\nLivro adicionado com sucesso!\n");
		return true;		
	}
	
	public boolean remover(int posicao){				
		livros.remove(posicao);
		System.out.println("\nLivro removido com sucesso!\n");
		return true;		
	}
	
	public void imprimirDadosLivro(int i) {

//		String[] palavrasChavesTamanho = livros.get(i).palavrasChaves;
		
        System.out.println("Titulo: " + livros.get(i).titulo);
        System.out.println("Autor: " + livros.get(i).autor);
        System.out.println("Resumo: " + livros.get(i).resumo);
        System.out.println("Numero de paginas: " + livros.get(i).numPaginas);

//      Tentei fazer desta forma mas nao consegui :/
//    	System.out.println("Palavras-chave: ");
//        for(int j = 0; j < livros.get(i).palavrasChaves.length; j++){
//        	System.out.println(livros.get(i).palavrasChaves[j] + "; ");
//        }
//        
//    	System.out.println(palavrasChavesTamanho[0]);

        System.out.println("\n");
		
	}
	
	public void imprimirLivros() {
		
		for(int i = 0; i < getQuantidadeLivros(); i++) {
	        System.out.println("Posicao "+i);
			imprimirDadosLivro(i);			
		}		
	}	
}