public class Artigo extends Publicacao {

	String tituloSessao, textoSessao;

	
	public Artigo(String autor, String titulo, int ano) {
		super(autor, titulo, ano);
	}


	public Artigo() {
	}


	public String getTituloSessao() {
		return tituloSessao;
	}


	public void setTituloSessao(String tituloSessao) {
		this.tituloSessao = tituloSessao;
	}


	public String getTextoSessao() {
		return textoSessao;
	}


	public void setTextoSessao(String textoSessao) {
		this.textoSessao = textoSessao;
	}

	public void imprimir() {
		
		System.out.println("\n");
		System.out.println("---- ARTIGO ----");
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Ano: " + getAno());
		System.out.println("Sessao: " + getTituloSessao());
		System.out.println("Texto: " + getTextoSessao());
		System.out.println("\n");
	
	}
	
}
