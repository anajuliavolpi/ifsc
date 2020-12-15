
import java.util.Scanner;

public class SistemaCatalogoLivros {

	private CatalogoLivros catalogoLivros;

	private Scanner teclado;
	
	public SistemaCatalogoLivros() {
		catalogoLivros = new CatalogoLivros();
		teclado = new Scanner(System.in);
	}

	public void iniciarSistema(){
		int op = -1;
		while(op != 0){
			op = menuPrincipal();
			switch(op){
			case 1:
				adicionarLivro();
				break;
			case 2:
				catalogoLivros.imprimirLivros();
				break;	
			case 3:
				removerLivro();
				
				break;
			case 0:
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	private void removerLivro() {
		System.out.println("Digite a posição do livro: ");
		int position = Integer.parseInt(teclado.nextLine());
		if(position < catalogoLivros.getQuantidadeLivros()) {
			catalogoLivros.remover(position);
		} else {
			System.out.println("Posicao invalida!");
		}
	}

	private void adicionarLivro() {

		Livro novoLivro = new Livro();
		
		System.out.println("Digite o título: ");
		novoLivro.titulo = teclado.nextLine();
		System.out.println("Digite o resumo: ");
		novoLivro.resumo = teclado.nextLine();
		System.out.println("Digite o autor: ");
		novoLivro.autor = teclado.nextLine();
		System.out.println("Digite o num. paginas: ");
		novoLivro.numPaginas = teclado.nextLine();
//		System.out.println("Digite as palavras-chaves: ");
//		novoLivro.palavrasChaves[0] = teclado.nextLine();

		catalogoLivros.adicionar(novoLivro);
	
	}

	public int menuPrincipal(){
		System.out.println("---------------MENU-----------------");
		System.out.println("  1 - Adicionar Livro");
		System.out.println("  2 - Imprimir Livros");
		System.out.println("  3 - Remover livro (por posição)");
		System.out.println("  0 - Sair");
		System.out.println("------------------------------------");
		System.out.println("Digite opção:");
		int op = Integer.parseInt(teclado.nextLine());
		return op;
	}
}