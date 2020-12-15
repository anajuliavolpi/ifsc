import java.util.Scanner;

public class SistemaBiblioteca {

	private Biblioteca biblioteca;

	private Scanner teclado;

	public SistemaBiblioteca() {
		biblioteca = new Biblioteca();
		teclado = new Scanner(System.in);
	}

	public void iniciarSistema(){
		int op = -1;
		while(op != 0){
			op = menuPrincipal();
			switch(op){
			case 1:
				adicionarPublicacao();
				break;
			case 2:
				biblioteca.listarAcervo();
				break;
			case 3:
				imprimirPublicacao();
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

	private void imprimirPublicacao() {
		if(biblioteca.getQuantidadeLivros() > 0){
			System.out.println("Digite a posição: ");
			int pos = Integer.parseInt(teclado.nextLine());
			biblioteca.imprimirItem(biblioteca.getPublicacao(pos-1));
		}else{
			System.out.println("\nNão há publicações cadastradas!\n");
		}
	}

	private void adicionarPublicacao() {
		int op = -1;
		do{
			op = menuPublicacao();
			switch(op){
			case 1:
				adicionarLivro();
				break;
			case 2:
				adicionarArtigo();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}while( ! (op == 1 ||op ==2 ));
	}

	private void adicionarArtigo() {
		
		Artigo novoArtigo = new Artigo();
		
		System.out.println("Digite o título: ");
		novoArtigo.setTitulo(teclado.nextLine());
		System.out.println("Digite o autor: ");
		novoArtigo.setAutor(teclado.nextLine());
		System.out.println("Digite o ano: ");
		novoArtigo.setAno(Integer.parseInt(teclado.nextLine()));

		System.out.println("Digite as informacoes da sessao: ");		
		System.out.println("Titulo da sessao: ");
		novoArtigo.setTituloSessao(teclado.nextLine());
		System.out.println("Texto da sessao: ");
		novoArtigo.setTextoSessao(teclado.nextLine());
				
		biblioteca.adicionar(novoArtigo);
	}

	private void adicionarLivro() {

		Livro novoLivro = new Livro();
		
		System.out.println("Digite o título: ");
		novoLivro.setTitulo(teclado.nextLine());
		System.out.println("Digite o autor: ");
		novoLivro.setAutor(teclado.nextLine());
		System.out.println("Digite o ano: ");
		novoLivro.setAno(Integer.parseInt(teclado.nextLine()));
		
		System.out.println("Digite as informacoes do capitulo: ");		
		System.out.println("Titulo do capitulo: ");
		novoLivro.setTituloCapitulo(teclado.nextLine());
		System.out.println("Texto do capitulo: ");
		novoLivro.setTextoCapitulo(teclado.nextLine());
		
		biblioteca.adicionar(novoLivro);
	
	}

	public int menuPrincipal(){
		System.out.println("---------------MENU-----------------");
		System.out.println("  1 - Adicionar Publicação");
		System.out.println("  2 - Listar Acervo");
		System.out.println("  3 - Imprimir Publicação");
		System.out.println("  0 - Sair");
		System.out.println("------------------------------------");
		System.out.println("Digite opção:");
		int op = Integer.parseInt(teclado.nextLine());
		return op;
	}

	public int menuPublicacao(){
		System.out.println("---------------MENU-----------------");
		System.out.println("  1 - Adicionar Livro");
		System.out.println("  2 - Adicionar Artigo");
		System.out.println("------------------------------------");
		System.out.println("Digite opção:");
		int op = Integer.parseInt(teclado.nextLine());
		return op;
	}

}

