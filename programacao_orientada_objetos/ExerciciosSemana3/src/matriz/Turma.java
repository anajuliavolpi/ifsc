package matriz;

public class Turma {

	public Turma(String string, int[][] notas) {

	}

	public void imprimirNotas(int[][] notas) {

	    System.out.println("Notas da Turma ADS3-POO");
	    System.out.println("P1   P2   P3   Média");

		for (int i = 0; i < 5; i++) {
			float media = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
		    System.out.println(notas[i][0] + "   " + notas[i][1] + "   " + notas[i][2] + "   " + media);
		}	
	}

	public float mediaTurma(int[][] notas) {
		
		float media = 0;		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				media =+ notas[i][j];					
			}			
		}
		return media;
		
	}

	public int maiorNota(int[][] notas) {
		
		int maior = -1;		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (notas[i][j] >= maior) {
					maior = notas[i][j];					
				}				
			}			
		}
		return maior;
	}

	public int menorNota(int[][] notas) {
		
		int menor = 99999;		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (notas[i][j] <= menor) {
					menor = notas[i][j];					
				}				
			}			
		}
		return menor;
	}

}

//SAÍDA ESPERADA
//Notas da Turma ADS3-POO
//P1   P2   P3   Média
//8    9    7   8.00
//6    8    9   7.67
//9   10    9   9.33
//10    8    8   8.67
//8    6    8   7.33
//Média da Turma: 8.2
//Maior Nota: 10
//Menor Nota: 6
