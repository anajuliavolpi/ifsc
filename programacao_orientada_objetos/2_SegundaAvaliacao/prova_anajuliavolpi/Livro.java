public class Livro extends Publicacao {
	
	String tituloCapitulo, textoCapitulo;
	

	public Livro() {
	}
	
	public Livro(String autor, String titulo, int ano) {
		super(autor, titulo, ano);
	}

	public String getTituloCapitulo() {
		return tituloCapitulo;
	}

	public void setTituloCapitulo(String tituloCapitulo) {
		this.tituloCapitulo = tituloCapitulo;
	}

	public String getTextoCapitulo() {
		return textoCapitulo;
	}

	public void setTextoCapitulo(String textoCapitulo) {
		this.textoCapitulo = textoCapitulo;
	}

	public void imprimir() {

		System.out.println("\n");
		System.out.println("---- LIVRO ----");
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Ano: " + getAno());
		System.out.println("Capitulo: " + getTituloCapitulo());
		System.out.println("Texto: " + getTextoCapitulo());
		System.out.println("\n");
	
	}

}

