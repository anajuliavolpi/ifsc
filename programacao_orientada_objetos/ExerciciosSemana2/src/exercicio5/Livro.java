package exercicio5;

public class Livro {

	String resumo, autor, titulo;
	int codigo, paginas;
	
		
	public Livro(String resumo, String autor, String titulo, int paginas, int codigo) {
		super();
		this.resumo = resumo;
		this.autor = autor;
		this.titulo = titulo;
		this.paginas = paginas;
		this.codigo = codigo;
	}
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public String getResumo() {
		return resumo;
	}
	
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
	
	
	
	
	