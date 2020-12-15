
import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();

	public int getQuantidadeLivros(){
		return publicacoes.size();				
	}

	public void adicionar(Publicacao novaPublicacao){
		publicacoes.add(novaPublicacao);
	}
	
	public Publicacao getPublicacao(int item){
		return publicacoes.get(item);
	}

	public void listarAcervo() {

		for(int i = 0; i < publicacoes.size(); i++) {			
			if(publicacoes.get(i) instanceof Livro) {
				System.out.println("Item: " + (i+1));
				System.out.println("Livro: " + publicacoes.get(i).getTitulo() + "\n");				
			} else if (publicacoes.get(i) instanceof Artigo) {
				System.out.println("Item: " + (i+1));
				System.out.println("Artigo: " + publicacoes.get(i).getTitulo() + "\n");
			}			
		}
	}

	public void imprimirItem(Imprimivel publicacao) {
		publicacao.imprimir();	
	}

}
