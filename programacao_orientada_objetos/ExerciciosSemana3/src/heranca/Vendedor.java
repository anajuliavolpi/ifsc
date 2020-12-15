package heranca;

public class Vendedor extends Empregado {
	
	int valorVendas, qtdVendas;

	public Vendedor(String nome, int idade, String sexo, int salarioBruto, int matricula, int valorVendas, int qtdVendas) {
		super(nome, idade, sexo, salarioBruto, matricula);
		this.valorVendas = valorVendas;
		this.qtdVendas = qtdVendas;
	
	}

	public int getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(int valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	
	
}
