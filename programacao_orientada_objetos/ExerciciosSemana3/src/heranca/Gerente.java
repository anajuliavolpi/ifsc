package heranca;

public class Gerente extends Empregado {

	String gerencia;
	
	public Gerente(String nome, int idade, String sexo, int salarioBruto, int matricula,  String gerencia) {
		super(nome, idade, sexo, salarioBruto, matricula);
		this.gerencia = gerencia;
	}

	public String getGerencia() {
		return gerencia;
	}

	public void setGerencia(String gerencia) {
		this.gerencia = gerencia;
	}

	
}

