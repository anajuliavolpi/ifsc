package exercicio3;

import java.util.ArrayList;

public class Aluno {

	String nome;
	int faltas;
	float media;
	ArrayList<Integer> notas = new ArrayList<Integer>();

	public Aluno(String nome) {
		this.nome = nome;

	}

	public void addNota(int nota) {

		notas.add(nota);

	}

	public void verStatus() {

		float media = media();
		
		System.out.println("Status do " + nome);
		System.out.println("Numero de faltas: " + faltas);
		
		if(faltas > 10) {			
			System.out.println("Reprovado por falta");
			return;
		} else if (media < 6) {	
			System.out.println("Reprovado por nota");
			return;		
		} else {
			System.out.println("Aprovado com media " + media);
			return;			
		}
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public void listarNotas() {

		for (int i = 0; i < notas.size(); i++) {
			System.out.println("Prova " + (i+1) + ": " + notas.get(i));
		}
	}

	public float media() {

		float soma = 0;
		for (int i = 0; i < notas.size(); i++) {
			soma += notas.get(i);
		}
		media = soma / notas.size();
		return media;
	}

}
