package exercicio5;


public class Main {

	public static void main(String[] args) {
		
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.imprimirLivros();
		
		Livro livro = new Livro();
		livro.setCodigo(100);
		livro.setAutor("Autor 1");
		livro.setResumo("Resumo 1");
		livro.setTitulo("Titulo 1");
		livro.setPaginas(10);
		
		catalogoLivros.adicionar(livro);

		livro = new Livro();
		livro.setCodigo(101);
		livro.setAutor("Autor 2");
		livro.setResumo("Resumo 3");
		livro.setTitulo("Titulo 2");
		livro.setPaginas(20);
		
		catalogoLivros.adicionar(livro);
		
		catalogoLivros.imprimirLivros();
		
		catalogoLivros.remover(0);
		
		catalogoLivros.imprimirLivros();
		
		
	}
	
}

//SAIDA ESPERADA
//-------- Listagem de Livros --------
//
//Não há livros cadastrados!
//
//------------------------------------
//-------- Listagem de Livros --------
//Posição: 0
//Código: 100
//Título: Titulo 1
//Autor: Autor 1
//Resumo: Resumo 1
//Num. Páginas: 10
//
//Posição: 1
//Código: 101
//Título: Titulo 2
//Autor: Autor 2
//Resumo: Resumo 3
//Num. Páginas: 20
//
//------------------------------------
//-------- Listagem de Livros --------
//Posição: 0
//Código: 101
//Título: Titulo 2
//Autor: Autor 2
//Resumo: Resumo 3
//Num. Páginas: 20
//
//------------------------------------
