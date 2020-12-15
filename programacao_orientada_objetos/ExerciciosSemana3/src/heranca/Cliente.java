package heranca;

public class Cliente extends Pessoa {

	int divida, anoNascimento;
	
	public Cliente(String nome, int idade, String sexo, int divida, int anoNascimento) {
		super(nome, idade, sexo);
		this.divida = divida;
		this.anoNascimento = anoNascimento;
	
	}

	public int getDivida() {
		return divida;
	}

	public void setDivida(int divida) {
		this.divida = divida;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setK(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public static void imprimirCliente(Pessoa pessoa) {
		
	}

	
}
