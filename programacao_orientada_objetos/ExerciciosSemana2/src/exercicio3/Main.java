package exercicio3;



public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Joao");
		aluno1.addNota(6);
		aluno1.addNota(8);
		aluno1.addNota(7);
		aluno1.addNota(9);
		aluno1.setFaltas(5);
		aluno1.verStatus();
		aluno1.listarNotas();
		System.out.println("Media="+ aluno1.media()+"\n");
		
		Aluno aluno2 = new Aluno("Jose");
		aluno2.addNota(5);
		aluno2.addNota(6);
		aluno2.addNota(7);
		aluno2.setFaltas(22);
		aluno2.verStatus();
		aluno2.listarNotas();
		System.out.println("Media="+ aluno2.media()+"\n");
		
		Aluno aluno3 = new Aluno("Jorge");
		aluno3.addNota(5);
		aluno3.addNota(6);
		aluno3.setFaltas(10);
		aluno3.verStatus();
		aluno3.listarNotas();
		System.out.println("Media="+ aluno3.media()+"\n");
		

	}
}
//SAIDA ESPERADA
//Status do Joao
//Número de faltas: 5
//Aprovado com média 7.5
//Prova 1: 6
//Prova 2: 8
//Prova 3: 7
//Prova 4: 9
//Media=7.5
//
//Status do Jose
//Número de faltas: 22
//Reprovado por falta
//Prova 1: 5
//Prova 2: 6
//Prova 3: 7
//Media=6.0
//
//Status do Jorge
//Número de faltas: 10
//Reprovado por nota
//Prova 1: 5
//Prova 2: 6
//Media=5.5
//

