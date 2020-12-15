package heranca;

public class Empregado extends Pessoa {

	int salarioBruto, matricula, descontoINSS, salarioLiquido;
	
	public Empregado(String nome, int idade, String sexo, int salarioBruto, int matricula) {
		super(nome, idade, sexo);
		this.salarioBruto = salarioBruto;
		this.matricula = matricula;
	}

	public int getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getDescontoINSS() {
		
		descontoINSS = (int) (salarioBruto * 0.1);
		return descontoINSS;
	}
	
	public int getSalarioLiquido() {
		
		salarioLiquido = salarioBruto - descontoINSS;
		return salarioLiquido;
	}
}
